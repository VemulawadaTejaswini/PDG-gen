import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String ab = a+b;
		int sum = Integer.parseInt(ab);
		int sqrt = (int)Math.sqrt(sum);
		System.out.println(sqrt*sqrt == sum ? "Yes":"No");
	}
}
