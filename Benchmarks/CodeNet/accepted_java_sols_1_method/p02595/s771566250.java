import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		long D = Long.valueOf(s.next());
		long[] x = new long[N];
		long[] y = new long[N];
		for(int i = 0; i < N; i++) {
			x[i] = Long.valueOf(s.next());
			y[i] = Long.valueOf(s.next());
		}
		int ret = 0;
		long d = D * D;
		for(int i = 0; i < N; i++) {
			if(d >= ((x[i] * x[i]) + (y[i] * y[i]))) {
				ret++;
			}
		}
		System.out.println(ret);
	}
}