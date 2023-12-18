import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ret = 1;
		for(int i = 2; i <= n; i++) {
			ret *= i;
		}
		System.out.printf("%.0f\n", ret);
	}
}