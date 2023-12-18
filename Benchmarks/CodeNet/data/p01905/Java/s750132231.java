import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = n - 1;
		System.out.println(Math.max(0, n - 1 - m));
	}
}

