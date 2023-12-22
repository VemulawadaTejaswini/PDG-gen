import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int ans = a - b*2;
			if(ans < 0) ans = 0;
			
			System.out.println(ans);
		}
	}
}