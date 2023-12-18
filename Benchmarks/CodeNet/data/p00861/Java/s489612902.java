import java.util.*;

public class Main{
	
	//1135 start
	//1211 stop
	//1245 restart
	
	class Parse{
		int pos;
		String s;
		HashMap<String, HashMap<Integer, Integer>> heap;
		boolean flg;
		Parse(){
			heap = new HashMap<String, HashMap<Integer, Integer>>();
		}
		
		private boolean eval(String now) {
			s = new String(now + "#");
			pos = 0;
			flg = true;
			program();
			return flg;
		}

		private void program() {
			int res = s.indexOf('=');
			if(res == -1){
				declaration();
			}
			else{
				assignment();
			}
		}

		private void assignment() {
			String res = arrayname();
			if(! heap.containsKey(res)){
				flg = false;
				return ;
			}
			pos++;
			int res2 = exp();
			pos++;
			if(heap.get(res).get(-1) <= res2) flg = false;
			if(! flg) return;
			// = 
			//System.out.println(res + " " + flg + " " + s.charAt(pos));
			pos++;
			int res3 = exp();
			if(! flg) return;
			heap.get(res).put(res2, res3);
		}

		private int exp() {
			char c = s.charAt(pos);
			int num = -1;
			if(Character.isDigit(c)){
				num = number();
			}
			else{
				String arr = arrayname();
				if(! heap.containsKey(arr)){
					flg = false;
					return -1;
				}
				
				pos++;
				int res = exp();
				if(! flg) return -1;
				pos++;
				if(! heap.get(arr).containsKey(res)){
					flg = false;
					return -1;
				}
				num = heap.get(arr).get(res);
			}
			return num;
		}

		private void declaration() {
			String res = arrayname();
			pos++;
			int res2 = number();
			pos++;
			HashMap<Integer, Integer> nhm = new HashMap<Integer, Integer>();
			nhm.put(-1, res2);
			heap.put(res, nhm);
		}

		private int number() {
			StringBuilder sb = new StringBuilder();
			while(true){
				char c = s.charAt(pos);
				if(! Character.isDigit(c)) break;
				sb.append(c);
				pos++;
			}
			return Integer.parseInt(sb.toString());
		}

		private String arrayname() {
			StringBuilder sb = new StringBuilder();
			while(true){
				char c = s.charAt(pos);
				if(! Character.isLetter(c)) break;
				sb.append(c);
				pos++;
			}
			return sb.toString();
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.next();
			if(s.equals(".")) break;
			ArrayList<String> list  = new ArrayList<String>();
			list.add(s);
			while(true){
				String ss = sc.next();
				if(ss.equals(".")) break;
				list.add(ss);
			}
			
			int ans = 0;
			
			Parse p = new Parse();
			for(int i = 0; i < list.size(); i++){
				String now = list.get(i);
				boolean res = p.eval(now);
				if(! res){
					ans = i + 1;
					break;
				}
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().doit();
	}
}