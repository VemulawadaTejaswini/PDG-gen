import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		Long n = scan.nextLong();
		long ans = 0;
		for(int i = 1; i < n + 1; i++) {
			if(!(i % 3 == 0 || i % 5 == 0)) {
				ans = ans + i;
			}
		}
		System.out.println(ans);
	}
}