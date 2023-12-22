import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try (Scanner sc = new Scanner(System.in)) {
				long a = sc.nextLong();
				long b = sc.nextLong();
				long c = sc.nextLong();
				long d = sc.nextLong();

				long ans = Math.max(a*c, b*d);
				ans = Math.max(ans, a*d);
				ans = Math.max(ans, b*c);

				
				System.out.println(String.valueOf(ans));

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}