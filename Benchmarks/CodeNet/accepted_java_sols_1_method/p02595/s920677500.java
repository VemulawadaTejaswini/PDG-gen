import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double d = sc.nextDouble();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (Math.sqrt(Math.pow(sc.nextDouble(), 2) + Math.pow(sc.nextDouble(), 2)) <= d) {
				++count;
			}
		}
		System.out.println(count);
	}
}
