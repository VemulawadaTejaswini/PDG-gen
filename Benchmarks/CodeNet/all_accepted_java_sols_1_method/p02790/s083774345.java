import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();

		 StringBuilder asb = new StringBuilder();

		 // a * b
		 for(int i= 0; i< Integer.parseInt(b); i++) {
			 asb.append(a);
		 }

		 StringBuilder bsb = new StringBuilder();

		 // b * a
		 for(int i= 0; i< Integer.parseInt(a); i++) {
			 bsb.append(b);
		 }

		 //System.out.println(asb.toString());
		 //System.out.println(asb.toString().compareTo(bsb.toString()));

		 if(asb.toString().compareTo(bsb.toString()) <= -1) {
			 System.out.println(asb.toString());
		 }else{
			 System.out.println(bsb.toString());
		 }


	}

}