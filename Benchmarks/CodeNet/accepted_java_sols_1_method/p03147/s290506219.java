import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int prev = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (prev < x) {
		        count += x - prev;
		    }
		    prev = x;
		}
		System.out.println(count);
	}
}
