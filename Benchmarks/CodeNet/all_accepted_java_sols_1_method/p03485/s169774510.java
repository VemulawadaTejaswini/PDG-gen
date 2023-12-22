import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double ans = (a + b) / 2;
		ans = Math.ceil(ans);
		int i = (int)ans;
		System.out.print(i);
	}
}