import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		final double Pl = 3.1416;
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		
		System.out.print(Pl*r*r);
		System.out.print(" ");
		System.out.print(2*Pl*r);
		
	}

}
