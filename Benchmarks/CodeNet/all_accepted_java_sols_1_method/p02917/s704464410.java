import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] b = new long[n];
		for(i=0;i<n-1;i++) {
			b[i] = parseLong(sc.next());
		}
		sc.close();
		long sum = b[0];
//		out.println(sum);
		for(i=1;i<n-1;i++) {
			sum += Math.min(b[i-1], b[i]);
		}
//		out.println(sum);
		sum += b[n-2];
		out.println(sum);
	}
}
