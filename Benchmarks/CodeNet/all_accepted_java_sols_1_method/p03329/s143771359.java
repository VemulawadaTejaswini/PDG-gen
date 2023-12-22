import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = n;
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int x = i;
            while (x > 0) {
                count += x % 6;
                x /= 6;
            }
            x = n - i;
            while (x > 0) {
                count += x % 9;
                x /= 9;
            }
            min = Math.min(min, count);
        }
		System.out.println(min);
	}
}
