import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] m = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			sum += m[i];
		}
		Arrays.sort(m);
		System.out.println(n + (x - sum) / m[0]);
	}
}