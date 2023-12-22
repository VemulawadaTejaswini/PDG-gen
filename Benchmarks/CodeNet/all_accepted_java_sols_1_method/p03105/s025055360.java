import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int ans = b/a;

			if(ans >= c) {
				System.out.println(c);
			}else {
				System.out.println(ans);
			}

	}
}

