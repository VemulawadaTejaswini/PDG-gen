import java.util.*;

public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int t = scan.nextInt();
	int y = scan.nextInt();
	int m = t*y;
	int n = 2*t + 2*y;

	System.out.println(m + " " + n);
	}
}