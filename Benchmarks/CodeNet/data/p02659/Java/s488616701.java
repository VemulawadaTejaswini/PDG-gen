import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextLong();
		float B = scan.nextFloat();
		double multi = 0;
		
		multi = A * B;
		
		System.out.println((long)Math.floor(multi));

	}

}
