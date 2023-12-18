import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		List<Double> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.add((double)y/(double)x);
		}
		Double max = list.stream().mapToDouble(Double::doubleValue).max().getAsDouble();
		System.out.println(BigDecimal.valueOf(max*t).toPlainString());
	}
}
