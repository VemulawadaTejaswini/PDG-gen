import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a []= {sc.nextDouble(),sc.nextDouble()};
		DecimalFormat f = new DecimalFormat("0.00000");
		System.out.println((int)(a[0]/a[1]) + " " + (int)(a[0]%a[1]) + " " + f.format(a[0]/a[1]));
		
		
	}
}