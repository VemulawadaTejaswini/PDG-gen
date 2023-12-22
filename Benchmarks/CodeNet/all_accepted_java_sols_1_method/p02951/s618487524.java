import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int ans;
		int free = a - b;
		if (free > 0) {
			if (free > c) {
				ans = 0;
			} else {
				ans = c - free;
			}
		} else {
			ans = c;
		}
		System.out.println(ans);
	}

}
