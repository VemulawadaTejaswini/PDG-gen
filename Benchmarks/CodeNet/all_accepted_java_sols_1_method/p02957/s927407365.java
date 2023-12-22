import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		if(((double)Math.abs(A - B)) % 2 == 0) {
			System.out.println((int)(Math.max(A, B) - Math.abs(A - B) / 2));
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}
