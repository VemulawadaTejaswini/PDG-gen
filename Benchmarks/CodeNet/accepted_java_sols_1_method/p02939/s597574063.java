import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		HashSet<String> set = new HashSet<>();
		int cnt=0;
		for (i = 0; i < s.length-1; i++) {
			if(s[i]==s[i+1]) {
				i+=2;
				cnt++;
			}
		}
//		out.println(set.toString());
		out.println(s.length-cnt);
	}
}
