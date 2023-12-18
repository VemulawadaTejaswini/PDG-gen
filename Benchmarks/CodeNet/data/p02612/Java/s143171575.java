import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int total = (int) Math.ceil(((double)n / 1000));
		total *= 1000;
		System.out.println(total - n);
	}
}