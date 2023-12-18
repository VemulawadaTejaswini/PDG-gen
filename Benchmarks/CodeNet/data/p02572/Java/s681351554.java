import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute21_1();
	}

	private static void execute21_2() {
		try (Scanner sc = new Scanner(System.in)) {
			int d = sc.nextInt();
			int t = sc.nextInt();
			int s = sc.nextInt();

			int ans = 999999;

			if(t*s>=d) {
				
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	private static void execute21_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long[] a = new long[N];
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextLong();
			}

			long ans = 0;

			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					if(j+1>=N) 
					ans += a[i]*a[j];
					else if(j+2>=N) {
						ans += a[i]*(a[j]+a[j+1]);
						j++;
					}
					else if(j+3>=N) {
						ans += a[i]*(a[j]+a[j+1]+a[j+2]);
						j++;
						j++;
					}
					ans = ans % 1000000007;
				}
			}
			System.out.println(ans);
		}
	}
}