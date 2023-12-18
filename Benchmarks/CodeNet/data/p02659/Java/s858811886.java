import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		long A = a.nextLong();
		double B = a.nextDouble();
		double C = A * B;
		long sum = (long)Math.floor(C);
		System.out.println(sum);	
	}
}