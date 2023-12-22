import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc = null;
		StringBuilder sb = new StringBuilder(s);
		StringBuilder pres;
		int l1 = s.length();
		while(true) {
			pres = sb;
			for(int i = sb.length()-2; i >=0; i--) {
				if(sb.length() > i + 1 &&
				   ((sb.charAt(i) == '0' && sb.charAt(i+1) == '1') ||
				   (sb.charAt(i) == '1' && sb.charAt(i+1) == '0'))) {
					sb.replace(i, i+2, "");
				}
			}
			if(pres.equals(sb)) break;
		}
		System.out.println(l1 - sb.length());
	}
}
