import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int ret = T.length();
		for(int i = 0 ; i <= S.length() - T.length() ; ++i){
			int change = 0;
			for(int j = 0 ; j < T.length() ; ++j){
				char cs = S.charAt(i + j);
				char ct = T.charAt(j);
				if(cs != ct){
					++change;
				}
			}
			ret = Math.min(ret, change);
		}
		System.out.println(ret);
	}
}
