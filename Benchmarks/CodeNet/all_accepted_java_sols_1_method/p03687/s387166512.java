import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		sc.close();
		int ans=101;
		for(char c = 'a'; c<='z';c++) {
			String[] ss = s.split(String.valueOf(c));
			int mx=0;
			for (i = 0; i < ss.length; i++) {
				if(mx<ss[i].length()) mx = ss[i].length(); 
			}
			if(mx<ans)ans=mx;
		}
		out.println(ans);
	}
}
