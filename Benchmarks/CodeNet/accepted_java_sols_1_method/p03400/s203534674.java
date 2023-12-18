
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		d--;
		x += n;
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			x += d / tmp;
		}
		System.out.println(x);
	}

}
