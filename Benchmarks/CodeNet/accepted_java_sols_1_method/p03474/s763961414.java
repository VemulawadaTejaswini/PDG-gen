import java.util.*;
//import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		boolean f=true;
		for (i = 0; i < a; i++) {
			if(s[i] < '0' || '9' < s[i]) {
				f=false;
				break;
			}
		}
		if(f && s[i] != '-') {
			f=false;
		}
		if(f) {
			i++;
			for (; i < a+b+1; i++) {
				if(s[i] < '0' || '9' < s[i]) {
					f=false;
					break;
				}
			}
		}
		out.println(f?"Yes":"No");
	}
}
