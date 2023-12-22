import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
	    int b = scan.nextInt();

	    int d = a / b;
	    int r = a % b;
	    double  f = ((double)a /(double)b);
	    System.out.print(d + " " + r + " ");
	    System.out.printf("%.5f",f);

	 
	}
}