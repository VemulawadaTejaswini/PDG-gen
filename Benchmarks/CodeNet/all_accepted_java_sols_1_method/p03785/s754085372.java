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
		long c = parseLong(sc.next());
		long k = parseLong(sc.next());
		long[] t = new long[n];
		for (i = 0; i < t.length; i++) {
			t[i] = parseLong(sc.next());
		}
		sc.close();
		Arrays.parallelSort(t);
		long bus=0;
		long person=0;
		long limit=t[0]+k;
		for (i = 0; i < t.length; i++) {
			person++;
			if(t[i]>limit || person>c) {
				bus++;
				person=1;
				limit=t[i]+k;
			}
		}
		if(person>0)bus++;
		out.println(bus);
	}
}
