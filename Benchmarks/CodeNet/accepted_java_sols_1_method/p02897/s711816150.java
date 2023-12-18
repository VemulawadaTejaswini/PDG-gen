import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		double b = 0;
		b = (double) a / 2;
		double odd_num = 0;
		odd_num = Math.ceil(b);

		double probability = 0;
		probability = odd_num / (double) a;
		System.out.printf("%.9f", probability);
		System.out.println();

	}
}
