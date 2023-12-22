import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String result = "WA";
		if("A".equals(S.substring(0,1))) {
			S = S.substring(1);
			if(S.indexOf("C") > 0  && S.indexOf("C") < S.length()-1
					&& S.indexOf("C") == S.lastIndexOf("C")) {
				S = S.substring(0,S.indexOf("C")) + S.substring(S.indexOf("C")+1);
				String s = S.toLowerCase();
				if(S.equals(s)) {
					result = "AC";
				}
			}
		}
		System.out.println(result);
	}
}
