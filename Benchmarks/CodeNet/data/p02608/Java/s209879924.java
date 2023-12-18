import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] f = new int[n+1];
		for (int x=1; x<=Math.sqrt(n); x++) {
			for (int y=1; y<=Math.sqrt(n); y++) {
				for (int z=1; z<=Math.sqrt(n); z++) {
					int sum = x*x + y*y + z*z + x*y + x*z + y*z;
					if (sum <= n)
						f[sum]++;
				}
			}
		}
		for (int i=1; i<=n; i++)
			System.out.println(f[i]);
	}
}

