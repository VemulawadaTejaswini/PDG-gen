import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();

		double part = (double)l / (double)3.0;
		
		double box = part * part * part;
		
		
		log( box );
		sc.close();
		
	}

	static void log(double d) {
		System.out.printf("%.12f\n",d);
	}

}
