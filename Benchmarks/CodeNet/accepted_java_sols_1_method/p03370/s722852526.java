import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] m = new int[n];
		for(int i = 0 ; i < n ; i++) m[i] = sc.nextInt();
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			sum += m[i];
		}
		Arrays.sort(m);
		int temp = x - sum;
		System.out.println(n + temp / m[0]);
	}
}
