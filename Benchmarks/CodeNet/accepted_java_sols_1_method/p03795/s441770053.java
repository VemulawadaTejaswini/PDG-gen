
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, ans = 0;
		
		n = sc.nextInt();
		
		ans = 800 * n - (n / 15) * 200;
		
		System.out.println(ans);
		
		sc.close();
	}

}
