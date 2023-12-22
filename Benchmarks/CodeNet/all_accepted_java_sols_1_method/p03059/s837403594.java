import java.util.*;
import java.lang.*;

public class Main {
	static long mod = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		System.out.println(t / a * b);
	}
}