import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ai = new int[n];
		int max = -1000001;
		int min = 1000001;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			ai[i] = scan.nextInt();
			if (max < ai[i]) {
				max = ai[i];
			}
			if (min > ai[i]) {
				min = ai[i];
			}
			sum = sum + ai[i];
		}
		System.out.print(min + " ");
		System.out.print(max + " ");
		System.out.println(sum);
	}
}