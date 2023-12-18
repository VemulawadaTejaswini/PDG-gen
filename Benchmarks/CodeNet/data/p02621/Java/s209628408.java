import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int ans = a + (a * a) + (a * a * a);
		System.out.println(ans);
	}
}