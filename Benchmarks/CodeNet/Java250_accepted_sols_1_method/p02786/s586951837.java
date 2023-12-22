import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = Long.parseLong(sc.next());
		long sum = 0;
		long pow = 1;
		while (h >= 1) {
			h /= 2;
			sum += pow;
			pow *= 2;
		}

		System.out.println(sum);

		sc.close();
	}
}