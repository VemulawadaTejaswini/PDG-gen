import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;
		int prev = 10;
		int count = 0;
		int max = 0;
		while (x > 0) {
			if (prev == x % 10) {
				count++;
				if (max < count) {
					max = count;
				}
			} else {
				prev = x % 10;
				count = 1;
			}
			x /= 10;
		}
		if (max >= 3) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
