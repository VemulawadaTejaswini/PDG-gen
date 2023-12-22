import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		sc = null;
		int i;
		int cnt=0;
		int max=0;
		for(i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'A'||
				s.charAt(i) == 'C'||
				s.charAt(i) == 'G'||
				s.charAt(i) == 'T') {
				cnt++;
			} else {
				cnt=0;
			}
			max=max(max,cnt);
		}
		System.out.println(max);
	}
}