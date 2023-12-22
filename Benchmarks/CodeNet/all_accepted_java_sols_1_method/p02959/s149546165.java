import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		for(int i=0;i<N+1;i++) {
			A[i] = sc.nextInt();
		}
		
		long ret = 0;
		for(int i=0;i<N;i++) {
			int b = sc.nextInt();
			if(A[i]-b>=0) {
				ret += b;
				continue;
			}
			else {
				ret += A[i];
				b = b - A[i];
				ret += Math.min(A[i+1], b);
				A[i+1] -= Math.min(A[i+1], b);
			}
		}
		
		out.println(ret);
		sc.close();
	}
}