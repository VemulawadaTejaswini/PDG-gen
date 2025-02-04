import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		int[] modified = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			modified[i] = (a[i] > x) ? x : a[i];
		}
		for(int i = 0; i < n - 1; i++) {
			if(modified[i] + modified[i + 1] > x)
				modified[i + 1] = x - modified[i];
		}
		long sum = 0;
		for(int i = 0; i < n; i++)
			sum += a[i] - modified[i];
		System.out.println(String.valueOf(sum));
	}
}