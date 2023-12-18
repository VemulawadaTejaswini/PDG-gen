import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), m = in.nextLong(), d = in.nextLong();
		System.out.printf("%.6f", ((n - d) * (d == 0 ? 1 : 2)) * (m - 1) / (double)(n * n));
	}
}
