import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.next(); 
		char[] X = N.toCharArray();
		//System.out.println(X);
		char NLast1= X[X.length-1] ;
		int NLast = Character.getNumericValue(NLast1);
		//System.out.println(NLast);
		//System.out.println(NLast==2);
		if(NLast==2) {
			System.out.println("hon");
		}
		
		if(NLast==4) {
			System.out.println("hon");
		}
		if(NLast==5) {
			System.out.println("hon");
		}
		if(NLast==7) {
			System.out.println("hon");
		}
		if(NLast==9) {
			System.out.println("hon");
		}
		if(NLast==0) {
			System.out.println("pon");
		}
		if(NLast==1) {
			System.out.println("pon");
		}
		if(NLast==6) {
			System.out.println("pon");
		}
		if(NLast==8) {
			System.out.println("pon");
		}
		if(NLast==3) {
			System.out.println("bon");
		}

	}

}
