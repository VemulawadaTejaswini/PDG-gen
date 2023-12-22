import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		int[] a = new int[26];
		for(i=0;i<s.length;i++) {
			a[s[i]-'a']++;
		}
		boolean f=true;
		for (i = 0; i < a.length; i++) {
			if(a[i]>1) {
				f=false;
				break;
			}
		}
		out.println(f?"yes":"no");
	}
}
