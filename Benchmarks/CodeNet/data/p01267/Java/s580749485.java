import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 2149
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), X = sc.nextInt();
			if (N == 0 && A == 0 && B == 0 && C == 0 && X == 0) break;
			// ArrayList<Integer> Y = new ArrayList<Integer>();
			int[] Y = new int[N];
			
			for (int i = 0; i < N; i++) Y[i] = sc.nextInt();
			
			int idx = 0, f = 0;
			for (f = 0; f <= 10000; f++) {
				if (Y[idx] == X) idx++;
				//System.out.println("frame " + f + ":" + X);
				X = (A * X + B) % C;
				if (idx == N) break;
			}
			if (f == 10001) f = -1;
			System.out.println(f);
		}
	}	
}