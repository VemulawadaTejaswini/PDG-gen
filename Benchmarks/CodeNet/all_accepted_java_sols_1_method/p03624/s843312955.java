import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int AB = 26;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		int[] cnt = new int[AB];
		for(i=0;i<s.length;i++) {
			cnt[s[i]-'a']++;
		}
		boolean f=false;
		for(i=0;i<AB;i++) {
			if(cnt[i]==0) {
				f=true;
				break;
			}
		}
		out.println(f?(char)('a'+i):"None");
	}
}
