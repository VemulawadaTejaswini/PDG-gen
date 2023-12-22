import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double a,b;
		a = scan.nextDouble();
		b = scan.nextDouble();
		System.out.print((int)(a/b) + " " + (int)(a%b) + " ");
		System.out.printf("%.5f",(a/b));
		System.out.println("");
	}
}