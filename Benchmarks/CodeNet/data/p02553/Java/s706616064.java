import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){


			long a = scan.nextLong();
			long A = Math.abs(a);
			long b = scan.nextLong();
			long B = Math.abs(b);
			long c = scan.nextLong();
			long C = Math.abs(c);
			long d = scan.nextLong();
			long D = Math.abs(d);


			if(0<=a&&0<=c) {

				System.out.println(b*d);

			}else if(0<=a) {
				System.out.println(a*d);
			}else if (0<=c){
				System.out.println(b*c);

			}else {
				long x = Math.max(Math.abs(a)*Math.abs(c), Math.abs(b)*Math.abs(d));


				System.out.println(x);

			}



		}


	}


}
