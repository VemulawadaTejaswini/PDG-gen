import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long power = 1;
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			power *= i;
			power %= (int)Math.pow(10, 9) + 7;
		}
		System.out.println(power);
	}
}