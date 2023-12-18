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
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] a = new int[m][2];
			int[] nf = new int[n];
			
			int ans=99999999;
			
			for(int i=0;i<m;i++) {
				int aa = sc.nextInt();
				int bb = sc.nextInt();
				
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
			long sum=0;
			for (int i = 0; i < N; i++) {
				sum+=a[i];
				sum%=1000000007;
			}

			for (int i = 0; i < N - 1; i++) {
				
					sum-=a[i];
					ans += a[i]*sum;
					ans %= 1000000007;
				
			}
			System.out.println(ans);
		}
	}
}