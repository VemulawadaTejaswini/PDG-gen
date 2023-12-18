import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		int m = n;
		int cnt=0;
		for (i = 0; i < s.length-1; i++) {
			if(s[i] == 'R' && s[i+1] == 'L') {
				cnt++;
				i++;
			}
		}
		if(s[n-1] == 'R') {
			cnt++;
			m++;
		}
		if(s[0] == 'L') {
			cnt++;
			m++;
		}
		out.println(Math.min(n-1,m-2*(cnt-k)));
	}
}
