import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int m;
	static String input;
	static HashSet <String> set = new HashSet<String>();
	public static void main(String[] args) {
		while(read()){
			
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		m = sc.nextInt();
		for(int i = 0; i < m; i++){
			input = sc.next();
			solve();
		}
		return true;
	}
	
	static void solve(){
		for(int i = 1; i < input.length(); i++){
			String head = input.substring(0, i);
			String tail = input.substring(i);
			//System.out.println(head +" "+ tail);
			StringBuffer sh = new StringBuffer(head);
			StringBuffer st = new StringBuffer(tail);
			for(int j = 0; j < 2; j++){
				set.add(head + tail);
				set.add(head + st.reverse().toString());
				st.reverse();
				set.add(sh.reverse() + tail);
				sh.reverse();
				set.add(sh.reverse().toString() + st.reverse());
				sh.reverse();
				st.reverse();
				if(j == 0){
					StringBuffer sb = new StringBuffer(sh);
					String tmp = head;
					head = tail;
					tail = tmp;
					sh = st;
					st = sb;
				}
			}
		}
		System.out.println(set.size());
		String s = set.toString();
		//System.out.println(s);
		set.clear();
	}

}