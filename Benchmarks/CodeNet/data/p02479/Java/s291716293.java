import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str=scan.next();
		double r=Double.parseDouble(str);
		double P=Math.PI;
		System.out.print(r*r*P);
		System.out.print(" ");
		System.out.println(2*r*P);
	}

}