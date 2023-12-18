import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		NumberFormat nfNum = NumberFormat.getNumberInstance();

		nfNum.setMinimumFractionDigits(5);
		nfNum.setMaximumFractionDigits(5);

		long d, r;
		double f;
		long a = scan.nextInt();
		int b = scan.nextInt();

		d = a / b;
		r = a % b;
		f = (double)a / b;
		nfNum.format(f);

		System.out.println(d + " " + r + " " + f);
        scan.close();
    }

}