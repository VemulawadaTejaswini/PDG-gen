import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		int odd=0;
		int even=0;
		for (i = 0; i < a.length; i++) {
			a[i] = parseInt(sc.next());
			if(a[i]%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		sc.close();
		boolean f=false;
		if(odd%2==1) {
			f=false;
		} else {
			f=true;
		}
		out.println(f?"YES":"NO");
	}
}
