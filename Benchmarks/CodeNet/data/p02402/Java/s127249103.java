import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int max = 0;
		int sum = 0;
		int n = sc.nextInt();
		for (int cnt = 0; cnt <= n; cnt++) {
			int a = sc.nextInt();
			if (cnt == 0) {
				min = a;
				max = a;
				sum = a;
			} else if (a <= min) {
				min = a;
				sum = sum + a;
				cnt++;
			} else if (a >= max) {
				max = a;
				sum = sum + a;
				cnt++;
			} else {
				sum = sum + a;
				cnt++;
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
