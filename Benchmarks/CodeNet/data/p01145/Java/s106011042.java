import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Princess's Japanese
public class Main{

	final int WORD = 0, SOKUON = 1, HATUON = 2, CHOON = 3;
	String[] nonvoice = {"k", "s", "t", "h", "p", "ky", "sy", "ty", "hy", "py"};
	
	class M{
		int type;
		String shiin;
		char boin;
		boolean del, conA, conO;
		public M(int type, String shiin, char boin) {
			this.type = type;
			this.shiin = shiin;
			this.boin = boin;
		}
		public String toString() {
			String r = shiin;
			if(boin=='?')return r;
			r+=del?("("+boin+")"):boin;
			return r;
		}
	}
	
	boolean isBoin(char ch){
		return ch=='a'||ch=='i'||ch=='u'||ch=='e'||ch=='o';
	}
	boolean isChoonBoin(char ch){
		return ch=='a'||ch=='i'||ch=='u';
	}
	boolean isNonVoiceShiin(String s){
		for(String t:nonvoice)if(t.equals(s))return true;
		return false;
	}
	
	List<M> decomp(char[] s){
		List<M> res = new ArrayList<M>();
		int n = s.length;
		int i = 0;
		while(i<n){
			char ch = s[i];
			//ê¹Ìê
			if(isBoin(ch)){
				//¼Oªê¹©Â©gª a, i, eÈç±êÍ·¹
				if(isChoonBoin(ch)&&i>0&&isBoin(s[i-1]))
					res.add(new M(CHOON, "", ch));
				//PÆÌê¹
				else
					res.add(new M(WORD, "", ch));
				i++;
			}
			//q¹Ìê
			else{
				//nÌê¾¯ÁÊ
				if(ch=='n'){
					//¶Èç¹
					if(i==n-1){
						res.add(new M(HATUON, "n", '?')); i++;
					}
					//¼ãª ' Èç¹
					else if(s[i+1]=='\''){
						res.add(new M(HATUON, "n", '?')); i+=2;
					}
					//¼ãªyÅÈ¢©Âê¹ÅÈ¢Èç¹
					else if(s[i+1]!='y'&&!isBoin(s[i+1])){
						res.add(new M(HATUON, "n", '?')); i++;
					}
					//¹ÅÍÈ¢nÆª©Á½
					else{
						if(isBoin(s[i+1])){
							res.add(new M(WORD, "n", s[i+1])); i+=2;
						}
						else {
							res.add(new M(WORD, ch+""+s[i+1], s[i+2])); i+=3;
						}
					}
				}
				//nÈOÌq¹Ìê
				else{
					//¯¶¶ª±¢Ä¢éÈç£¹
					if(s[i+1]==ch){
						res.add(new M(SOKUON, ch+"", '?')); i++;
					}
					else if(isBoin(s[i+1])){
						res.add(new M(WORD, ch+"", s[i+1])); i+=2;
					}
					else {
						res.add(new M(WORD, ch+""+s[i+1], s[i+2])); i+=3;
					}
				}
			}
		}
		return res;
	}
	
	M pre(List<M> list, int idx){
		int id = idx-1;
		while(id>=0){
			if(list.get(id).boin=='?')id--;
			else return list.get(id);
		}
		return null;
	}
	
	void findCon(List<M> list){
		int i = 0;
		int n = list.size();
		while(i<n){
			M m = list.get(i);
			if(isNonVoiceShiin(m.shiin)&&(m.boin=='a')){
				int j = i+1;
				while(j<n){
					M r = list.get(j);
					if(isNonVoiceShiin(r.shiin)&&(r.boin=='a')){
						m.conA = true; r.conA = true; j++;
					}
					else break;
				}
			}
			i++;
		}
		i = 0;
		while(i<n){
			M m = list.get(i);
			if(isNonVoiceShiin(m.shiin)&&(m.boin=='o')){
				int j = i+1;
				while(j<n){
					M r = list.get(j);
					if(isNonVoiceShiin(r.shiin)&&(r.boin=='o')){
						m.conO = true; r.conO = true; j++;
					}
					else break;
				}
			}
			i++;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			char[] s = sc.next().toCharArray();
			if(s[0]=='#')break;
			List<M> list = decomp(s);
			findCon(list);
//			for(M m:list){
//				System.out.println(m.type+" "+m.shiin+" "+m.boin+" conA:"+m.conA+" conO:"+m.conO);
//			}
			int n = list.size();
			int i = 0;
			while(i<n){
				M m = list.get(i);
//				System.out.println(m.shiin+" "+m.boin+" "+m.con);
				//ê¹ð½È¢ÍX[
				if(m.boin=='?'||m.boin=='e'){
					i++; continue;
				}
				//¼ßÌê¹ª³º»³êÄ¢éÈçX[
				M p = pre(list, i);
				if(p!=null&&p.del){
					//½¾µAA±ÌæªÈçÁ·
					if(i>0&&(m.conA&&!list.get(i-1).conA||m.conO&&!list.get(i-1).conO)){
						m.del = true;
						p.del = false;
					}
//					System.out.println(m.shiin+" "+m.boin+" "+m.con + " through.");
					i++; continue;
				}
				//i, uÌê
				if(m.boin=='i'||m.boin=='u'){
					//êÔãëÌÅÍÈ¢
					if(i<n-1){
						if(isNonVoiceShiin(m.shiin)&&isNonVoiceShiin(list.get(i+1).shiin)){
							m.del = true; i++; continue;
						}
					}
					//êÔãëÌÅ é
					else {
						if(isNonVoiceShiin(m.shiin)){
							m.del = true; i++; continue;
						}
					}
					i++; continue;
				}
				//aÌê
				else if(m.boin=='a'){
					//A±µÄÈ¢ÈçX[
					if(!m.conA){
						i++; continue;
					}
					//A±ÌÅãÌÅÍÈ¢
					if(i<n-1&&list.get(i+1).conA){
						m.del = true; i++; continue;
					}
					i++; continue;
				}
				//oÌê
				else{
					//A±µÄÈ¢ÈçX[
					if(!m.conO){
						i++; continue;
					}
					//A±ÌÅãÌÅÍÈ¢
					if(i<n-1&&list.get(i+1).conO){
						m.del = true; i++; continue;
					}
					i++; continue;
				}
			}
			for(M m:list)System.out.print(m);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}