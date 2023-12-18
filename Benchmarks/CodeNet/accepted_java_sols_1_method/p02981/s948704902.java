import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int n = sc.nextInt();

		int a = sc.nextInt();

		int b = sc.nextInt();

		System.out.println(Math.min(a*n,b));

	}
}
