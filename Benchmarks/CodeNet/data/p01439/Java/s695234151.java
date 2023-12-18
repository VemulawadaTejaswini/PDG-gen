import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main{

	class P{
		int num, pos;
		public P(int num, int pos) {
			this.num = num;
			this.pos = pos;
		}
	}
	int n;
	String[] s;
	boolean[] re, read, visited, enable;
	Map<String, List<P>> ref;
	List<Integer> res;
	
	void Read(int pos){
		if(read[pos])return;
		read[pos] = true;
		res.add(pos);
	}
	
	void visit(int pos){
		visited[pos] = true;
		if(s[pos].endsWith("1v")){
			re[pos] = true;
			String sub = s[pos].substring(0, s[pos].length()-1);
			String mark = ""; int x = -1;
			for(int j=0;j<sub.length();j++){
				if(Character.isDigit(sub.charAt(j))){
					mark = sub.substring(0, j);
					s[pos] = mark;
					x = Integer.parseInt(sub.substring(j));
					break;
				}
			}
			if(ref.containsKey(mark)){
				ref.get(mark).add(new P(x, pos));
			}
			else{
				ref.put(mark, new ArrayList<P>());
				ref.get(mark).add(new P(x, pos));
			}
		}
		else if("v".equals(s[pos])){
			s[pos] = "-";
			re[pos] = true;
		}
		else if(!"-".equals(s[pos])){
			String sub = s[pos];
			String mark = ""; int x = -1;
			for(int j=0;j<sub.length();j++){
				if(Character.isDigit(sub.charAt(j))){
					mark = sub.substring(0, j);
					s[pos] = mark;
					x = Integer.parseInt(sub.substring(j));
					break;
				}
			}
			if(ref.containsKey(mark)){
				ref.get(mark).add(new P(x, pos));
			}
			else{
				ref.put(mark, new ArrayList<P>());
				ref.get(mark).add(new P(x, pos));
			}
		}
	}
	
	int marked(int pos, String mark, int x, int r){
		Read(pos);
		if(re[pos-1]&&!read[pos-1]){
			enable[pos-1] = true;
			return pos-2;
		}
		List<P> list = ref.get(mark);
		for(int j=list.size()-1;j>=0;j--){
			P p = list.get(j);
			if(p.pos>pos)continue;
			if(p.num==x+1){
				return marked(p.pos, mark, x+1, x==1?pos:r);
			}
		}
		return r;
	}
	
	int read(int pos){
		if(read[pos])return pos+1;
		if(re[pos]){
			if(!enable[pos])return pos+1;
			Read(pos);
			if(re[pos-1]&&!read[pos-1]){
				enable[pos-1] = true;
				return pos-1;
			}
			if("-".equals(s[pos]))return pos+1;
			return marked(pos, s[pos], 1, pos);
		}
		if("-".equals(s[pos])){
			Read(pos);
			if(re[pos-1]&&!read[pos-1]){
				enable[pos-1] = true;
				return pos-1;
			}
			return pos+1;
		}
		P p = null;
		for(P v:ref.get(s[pos]))if(v.pos==pos){
			p = v; break;
		}
		if(p.num>=2)return pos+1;
		return marked(pos, s[pos], 1, pos)+1;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			n = sc.nextInt();
			if(n==0)break;
			s = new String[n+1];
			s[0] = "";
			re = new boolean[n+1];
			read = new boolean[n+1];
			visited = new boolean[n+1];
			visited[0] = true;
			enable = new boolean[n+1];
			read[0] = true;
			ref = new HashMap<String, List<P>>();
			for(int i=1;i<=n;i++){
				s[i]=sc.next();
			}
			res = new ArrayList<Integer>();
			int pos = 1;
			while(pos<=n){
				if(!visited[pos])visit(pos);
				pos = read(pos);
			}
			for(int a:res)System.out.println(a);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}