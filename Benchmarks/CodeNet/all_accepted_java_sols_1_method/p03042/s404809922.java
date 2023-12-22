import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int num1 = s/100;
		int num2 = s%100;
		boolean month1 = false;
		boolean month2 = false;
		if(num1>=1 && num1<=12) month1 = true;
		if(num2>=1 && num2<=12) month2 = true;
		if(month1&&month2) System.out.println("AMBIGUOUS");
		else if(month1) System.out.println("MMYY");
		else if(month2) System.out.println("YYMM");
		else System.out.println("NA");
		in.close();
	}

}
