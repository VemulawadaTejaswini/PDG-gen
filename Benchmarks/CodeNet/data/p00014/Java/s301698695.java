import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				int d = Integer.parseInt(sc.nextLine());
				System.out.println(calculate(d));
			}
		}
	}

	public static long calculate(int d) {
		long sum = 0;
		int n = 600 / d + 1;
		for (int i = 0; i < n; i++) {
			int x = Math.min(i * d, 600);
			int w = Math.min(d, 600 - (d * i)); 
			long y = x * x;
			sum += w * y;
		}
		return sum;
	}
}