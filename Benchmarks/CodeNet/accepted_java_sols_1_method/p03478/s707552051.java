import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0, add = 0;

		for (int i = 1; i <= N; i++) {
			if (String.valueOf(i).length() == 1 && a <= i && i <= b) {
				sum += i;
			} else {
				int j = 0;
				add = 0;
				while (j < String.valueOf(i).length()) {
					add += Integer.valueOf(String.valueOf(i).substring(j, j + 1));
					j++;
				}
				if (a <= add && add <= b) {
					sum += i;
				}
			}
		}
		
		System.out.println(sum);

		sc.close();
	}
}