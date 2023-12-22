
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		int ans = x + (y / 2);
		System.out.println(ans);
		sc.close();
	}

}
