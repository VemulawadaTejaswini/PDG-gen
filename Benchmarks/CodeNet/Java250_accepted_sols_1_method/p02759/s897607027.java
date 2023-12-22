import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		System.out.println(String.format("%.0f", Math.ceil(N / 2)));
		
		sc.close();
	}
	
}