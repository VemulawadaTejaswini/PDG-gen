import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prev = sc.nextInt() - 1;
		for (int i = 1; i < n; i++) {
		    int x = sc.nextInt();
		    if (prev < x) {
		        x--;
		    }
		    if (prev > x) {
		        System.out.println("No");
		        return;
		    }
		    prev = x;
		}
		System.out.println("Yes");
   }
}
