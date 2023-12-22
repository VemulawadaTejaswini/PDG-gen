import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int d,n;
			d=scan.nextInt();
			n=scan.nextInt();

			int result = 0;
			result = (int)Math.pow(100, d) * n;
			if(n == 100) result += (int)Math.pow(100, d);
			System.out.println(result);
			scan.close();
		}
}