import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		int m = Integer.parseInt(in.next());
		int all = (n + m) * (m + n - 1) / 2;
		int odd = n * m;
		int even = all - odd;
		
		System.out.println(even);
	}
}	