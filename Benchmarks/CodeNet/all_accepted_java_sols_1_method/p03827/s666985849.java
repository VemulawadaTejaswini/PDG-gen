import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD =  1000000007L;
	public static void main(String[] args) {
		int i,j,k,l;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		int mx=0;
		int x=0;
		for (i = 0; i < s.length; i++) {
			if(s[i]=='I')x++;
			if(s[i]=='D')x--;
			if(mx<x)mx=x;
		}
		out.println(mx);
	}
}
