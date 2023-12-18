import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int xx = 0;
		int yy = 0;
		int time = 0;
		for (int i = 0; i < n; i++) {
		    int t = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int d = Math.abs(x - xx) + Math.abs(y - yy);
		    int spent = t - time;
		    if (d > spent || (spent - d) % 2 != 0) {
		        System.out.println("No");
		        return;
		    }
		    xx = x;
		    yy = y;
		    time = t;
		}
		System.out.println("Yes");
	}
}
