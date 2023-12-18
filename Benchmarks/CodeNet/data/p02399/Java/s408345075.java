import java.util.Scanner;
import java.text.NumberFormat;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		NumberFormat nfNum = NumberFormat.getNumberInstance();
		nfNum.setMaximumFractionDigits(5);
		 
		int d, r;
		double f;
		int a = scan.nextInt();
		int b = scan.nextInt();

		d = a / b;
		r = a % b;
		f = (double)a / b;

		
		System.out.println(d + " " + r + " " + nfNum.format(f));
        scan.close();
    }

}