import java.util.Scanner;

public class Main {


		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			String N = scan.next();
			String [] token = N.split(" ");
			long a = Long.parseLong(token[0]);
			long b = Long.parseLong(scan.next());
			long c = Long.parseLong(scan.next());
			long d = Long.parseLong(scan.next());


			long max = Long.MIN_VALUE;
			max = Math.max(max, b*d);
			max = Math.max(max, a*c);
			max = Math.max(max, a*d);
			max = Math.max(max, b*c);
			System.out.println(max);
			scan.close();
		}

}