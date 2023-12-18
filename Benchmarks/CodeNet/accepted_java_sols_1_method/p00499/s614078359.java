import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(),
			c = sc.nextInt(), d = sc.nextInt();
		System.out.println( (l - Math.max((a+c-1)/c, (b+d-1)/d)) );
	}
}