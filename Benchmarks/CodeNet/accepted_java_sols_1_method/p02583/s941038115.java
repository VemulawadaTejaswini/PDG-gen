import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] l = new long[n];
		Arrays.setAll(l, i -> sc.nextLong());
		
		int cnt = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					
					long[] t = new long[3];
					t[0] = l[i];
					t[1] = l[j];
					t[2] = l[k];
					
					Arrays.sort(t);
					if (t[0] + t[1] > t[2]
							&& t[0] != t[1] && t[1] != t[2] && t[2] != t[0]) {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}


