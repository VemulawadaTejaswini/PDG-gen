import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double a[]=new double[2];
		
		for(int i=0;i<2;i++)
			a[i]=input.nextDouble();
		
		System.out.println((int)(a[0]*a[1]));
	}
	

}
