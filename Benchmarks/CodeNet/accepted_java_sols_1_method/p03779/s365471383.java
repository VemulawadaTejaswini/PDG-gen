import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int total = 0;
		int t = 0;
		for (int i = 1; total < x; i++) {
			total += i;
			t++;
		}
		System.out.println(t);
	}
}
