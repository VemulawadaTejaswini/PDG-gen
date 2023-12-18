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
	
	private static void execute21_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long[] a = new long[N];
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextLong();
			}
			
			
			long ans=0;
			
			for (int i = 0; i < N-1; i++) {
				for (int j = i+1; j < N; j++) {
				ans+=(a[i]*a[j]);
				ans=ans%1000000007;
				}
			}
			System.out.println(ans);
			
		}
	}
}