import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double r = scan.nextDouble();
		
		double men = r * r * Math.PI;
		double enn = 2 * r * Math.PI;
		
		System.out.println(String.format("%.6f", men)+" "+String.format("%.6f", enn));
	}
}
