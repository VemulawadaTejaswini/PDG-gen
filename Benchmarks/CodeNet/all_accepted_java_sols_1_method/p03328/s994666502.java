import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong(), h = 0;
		for(int i = 1; i < b - a; i++) {
			h += i;
		}
		System.out.println(h - a);
	}
}