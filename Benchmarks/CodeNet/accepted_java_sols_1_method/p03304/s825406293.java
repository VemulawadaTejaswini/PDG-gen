import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n = in.nextInt();
		double m = in.nextInt();
		double d = in.nextInt();
		System.out.printf("%.10f",(n - d) * (d == 0 ? 1 : 2) * (m - 1) / (n * n));
	}
}
