import java.util.ArrayList;
import java.util.Collections;
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



			ArrayList<Long>are =new ArrayList<Long>();

			are.add(a*c);
			are.add(a*d);
			are.add(b*c);
			are.add(b*d);



			Collections.sort(are, Collections.reverseOrder());

			System.out.println(are.get(0));



			/*

			if(0<=a&&0<=b) {
				if(c>=0&&d>=0) {
					System.out.println(b*d);
					return;

				}else if(c<0&&d>=0) {
					System.out.println(b*d);return;
				}else if(c<0&&d<0) {
					System.out.println(Math.max(a*d, b*c));return;
				}




			}

			if(0>a&&0<=b) {
				if(c>=0&&d>=0) {
					System.out.println(b*d);return;
				}else if(c<0&&d>=0) {
					System.out.println(Math.max(a*c, b*d));return;
				}else if(c<0&&d<0) {
					System.out.println(a*c);return;
				}


			}


			if (0>a&&b>0){
				if(c>=0&&d>=0) {
					System.out.println(Math.max(a*d, b*c));return;
				}else if(c<0&&d>=0) {
					System.out.println(a*c);return;
				}else if(c<0&&d<0) {
					System.out.println(a*c);return;
				}

			}

			*/




		}


	}


}
