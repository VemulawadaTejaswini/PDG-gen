import java.util.*;

public class Main {

	char [] []table = {
			{},
			{'.', ',', '!', '?', ' '},
			{'a', 'b','c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'},
			{'j', 'k', 'l'},
			{'m', 'n', 'o'},
			{'p', 'q','r','s'},
			{'t', 'u', 'v'},
			{'w','x','y','z'},
	};

	private void doit() {
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			String s = sc.next();
			StringBuilder sb = new StringBuilder();
			int len = s.length();
			int now = -1, ind = -1;
			for(int i = 0; i < len; i++){
				if(s.charAt(i) == '0'){
					if(now != -1){
						sb.append(table[ind][now]);
						now = -1;
					}
				}
				else{
					ind = s.charAt(i) - '0';
					now = (now + 1) % table[ind].length;
				}
			}
			System.out.println(sb.toString());
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}