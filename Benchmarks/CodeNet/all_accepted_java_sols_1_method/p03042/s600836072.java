import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int[] b = new int[4];

		b[0] = a/1000;
		b[1] = (a/100)%10;
		b[2] = (a/10)%10;
		b[3] = a%10;

		int TH = b[0]*10 + b[1];
		int TO = b[2]*10 + b[3];

		if(TH > 12) {
			if(TO > 12) System.out.print("NA");
			else if(TO <=12) {
				if(TO==0) {System.out.print("NA");
				System.exit(0);}
				System.out.print("YYMM");}

		}

		else if(TH <=12) {

			if(TH==0) {

			if(TO > 12) System.out.print("NA");
			else if(TO<=12 && TO>0)  System.out.print("YYMM");
			else if(TO==0) System.out.print("NA");
			}

			else {
				if(TO > 12) System.out.print("MMYY");
				else if(TO<=12 && TO>0) System.out.print("AMBIGUOUS");
				else if(TO==0) System.out.print("MMYY");
			}
		}
	}

}