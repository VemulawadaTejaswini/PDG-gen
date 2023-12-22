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
		int n = parseInt(sc.next());
		int[] a = new int[n];
		for(i=0;i<n;i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		boolean[] f = new boolean[n];
		int cnt=0;
		i=0;
		while(f[i]==false&&i!=1) {
			f[i]=true;
			i=a[i]-1;
			cnt++;
		}
		out.println(i==1?cnt:-1);
	}
}
