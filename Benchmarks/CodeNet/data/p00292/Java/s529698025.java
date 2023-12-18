import java.util.*;
import java.math.*;
import java.io.*;
 
class Main {
	static final int INF = 2 << 29;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] K = new int[n];
		int[] P = new int[n];
		for(int i = 0; i < n; i++) {
			K[i] = sc.nextInt();
			P[i] = sc.nextInt();
			System.out.println((((K[i]) % (P[i])) == 0)?P[i]:((K[i]) % (P[i])));
		}

	}
}
             
        