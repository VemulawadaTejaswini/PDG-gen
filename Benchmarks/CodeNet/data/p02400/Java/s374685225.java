import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double a=r*r*3.141592653589;
		double l=2*r*3.141592653589;
		
		System.out.println((String.format("%.6f", a))+" "+(String.format("%.6f", l)));


	}

}

