import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, max = -10000, min = 10000, sum = 0;
		n = sc.nextInt();
		for (int j = 0; j < n; j++) {
			i = sc.nextInt();
			if (min > i) {
				min = i;
			}
			if (max < i) {
				max = i;
			}
			sum = sum + i;
		}
		System.out.println(min + " " + max + " " + sum);
		sc.close();
	}
}

