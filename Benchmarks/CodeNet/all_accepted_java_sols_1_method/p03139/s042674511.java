import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min = Math.max(x + y - n, 0);
		int max = Math.min(x, y);
		System.out.println(max + " " + min);
	}
}
