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


			if(0<=a&&0<=b) {
				if(c>=0&&d>=0) {
					System.out.println(b*d);

				}else if(c<0&&d>=0) {
					System.out.println(b*d);
				}else if(c<0&&d<0) {
					System.out.println(a*d);
				}




			}else if(0>a&&0<=b) {
				if(c>=0&&d>=0) {
					System.out.println(b*d);
				}else if(c<0&&d>=0) {
					System.out.println(Math.max(a*c, b*d));
				}else if(c<0&&d<0) {
					System.out.println(a*c);
				}


			}else if (0>a&&b>0){
				if(c>=0&&d>=0) {
					System.out.println(b*c);
				}else if(c<0&&d>=0) {
					System.out.println(a*c);
				}else if(c<0&&d<0) {
					System.out.println(a*c);
				}

			}




		}


	}


}
