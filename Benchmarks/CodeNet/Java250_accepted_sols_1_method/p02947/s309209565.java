import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		String[] s = new String[n];
		for(i=0;i<n;i++) {
			s[i] = sc.next();
		}
		sc.close();
		String[] s2;
		for(i=0;i<n;i++) {
			s2 = s[i].split("");
			Arrays.sort(s2);
			s[i] = String.join("", s2);
		}
		HashMap<String, Integer> c = new  HashMap<>();
		for(i=0;i<n;i++) {
			if(c.containsKey(s[i])) {
				c.put(s[i], c.get(s[i])+1);
			} else {
				c.put(s[i], 1);
			}
		}
		long ans=0;
		for (Integer ii : c.values()) {
			ans += (long)ii*(ii-1)/2;
		}
		out.println(ans);
	}
}
