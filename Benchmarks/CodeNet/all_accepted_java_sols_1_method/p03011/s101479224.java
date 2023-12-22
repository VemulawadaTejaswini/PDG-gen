import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		int min = 1000;
		min = Math.min(min, P + Q);
		min = Math.min(min, P + R);
		min = Math.min(min, Q + R);
		System.out.println(min);
	}
}
