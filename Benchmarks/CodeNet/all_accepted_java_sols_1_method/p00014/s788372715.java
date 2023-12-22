import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum;
		
		while (sc.hasNext()) {
			n = sc.nextInt();
			sum = 0;
			for (int i = 0; i < 600 / n; i++) {
				sum += n * n * n * i * i;
			}
			System.out.println(sum);
		}
	}
}