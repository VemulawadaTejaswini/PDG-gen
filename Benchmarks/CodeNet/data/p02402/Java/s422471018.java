import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nos = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			nos[i] = sc.nextInt();
			sum += nos[i];
		}
		sc.close();
		Arrays.sort(nos);
		int min = nos[0];
		int max = nos[n-1];
		System.out.println(min + " " + max + " " + sum);
	}
}
