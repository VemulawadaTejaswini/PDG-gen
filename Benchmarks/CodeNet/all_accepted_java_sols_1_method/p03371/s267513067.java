import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans =  0;
		ans = a * x + b * y;
		if(ans > c * x * 2 + b * Math.max(0, (y - x))) {
			ans = c * x * 2 + b * Math.max(0, (y - x));
		}
		if(ans > c * y * 2 + a * Math.max(0, (x-y))) {
			ans = c * y * 2 + a * Math.max(0, (x-y));
		}
		System.out.println(ans);
	}
}
