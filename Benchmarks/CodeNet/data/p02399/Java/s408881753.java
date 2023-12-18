import java.util.Scanner;
class main {

	public static void main(String[] args) {
		Scanner cr = new Scanner(System.in);

		int a = cr.nextInt();
		int b = cr.nextInt();
		int c = a / b;
		int d = a % b;
		double e =  (double)a/(double)b;

		System.out.print(c +" "+d+" "+e);


	}

}