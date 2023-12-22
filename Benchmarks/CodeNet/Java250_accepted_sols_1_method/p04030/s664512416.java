import java.util.*;
public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String res = "";
		for(int i = 0; i < s.length(); i++) {
			if(res.length() > 0 && s.charAt(i) == 'B') {
				res = res.substring(0, res.length()-1);
			}
			else if(s.charAt(i) != 'B') {
				res += s.charAt(i);
			}
		}
		
		System.out.println(res);	
	}
}