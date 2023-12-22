import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		double range = (double)d * 2 + 1;
		System.out.println((int)Math.ceil(n / range));
	}
}