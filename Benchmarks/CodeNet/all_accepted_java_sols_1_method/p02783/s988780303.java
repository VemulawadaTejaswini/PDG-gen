import java.util.Scanner;
public class Main {
	public static void main (String args[]) {
		Scanner lector=new Scanner (System.in);
		int m=0;
		double H=lector.nextDouble();
		double A=lector.nextDouble();
		do {
			m++;
			H=( H-A);
		} while (H>0);
		System.out.print (m);
     }
}
