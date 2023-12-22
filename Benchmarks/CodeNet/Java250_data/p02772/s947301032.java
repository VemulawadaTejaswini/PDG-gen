import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		for (i = 0; i < a.length; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		boolean f=true;
		for (i = 0; i < n; i++) {
			if(a[i]%2==1)continue;
			if(a[i]%3!=0&&a[i]%5!=0) {
				f=false;
				break;
			}
		}
		out.println(f?"APPROVED":"DENIED");
	}
}
