import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];

		for(int i = 0; i < n; i++) p[i] = sc.nextInt();
		Arrays.sort(p);
		for(int j = 0; j < k; j++) sum += p[j];

		System.out.println(sum);
	}
}