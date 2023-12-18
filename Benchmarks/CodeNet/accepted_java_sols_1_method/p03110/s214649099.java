import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int scale = sc.nextInt();

		double[] num = new double[scale];

		String[] letter = new String[scale];

		double answer =0;

		for(int i=0; i<scale; i++) {
			num[i] = sc.nextDouble();
			letter[i] = sc.next();
		}

		for(int i=0; i<scale; i++) {
			if(letter[i] .equals( "JPY")) answer = answer + num[i];
			else if(letter[i] .equals( "BTC")) answer = answer + num[i]*380000.0;


		}

		System.out.print(answer);
	}

}
