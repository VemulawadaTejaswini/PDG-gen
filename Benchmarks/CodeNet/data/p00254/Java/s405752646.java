import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	private void doit(){
		while(true){
			String s = sc.next();
			if(s.equals("0000")) break;
			for(int i = 0;;i++){
				if(s.equals("6174")){
					System.out.println(i);
					break;
				}
				if(isNA(s)){
					System.out.println("NA");
					break;
				}
				int [] res = create(s);
				s = new String((res[1] - res[0]) + "");
			}
		}
	}

	private int[] create(String s) {
		char [] c = s.toCharArray();
		Arrays.sort(c);
		StringBuilder sb = new StringBuilder(new String(c));
		int [] res = new int[2];
		res[0] = Integer.parseInt(sb.toString());
		res[1] = Integer.parseInt(sb.reverse().toString());
		return res;
	}

	private boolean isNA(String s) {
		char c = s.charAt(0);
		for(int i = 1; i < s.length(); i++){
			if(c != s.charAt(i)) return false;
		}
		return true;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}