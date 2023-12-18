
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = sc.nextLong();
		for(int i = 1; i < n; i++) {
			ans = ans ^ sc.nextLong();
		}
		if(ans == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
