import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
 
		int l = scan.nextInt();
		double a = (double)l / 3.0;
 
		System.out.printf("%.12f" , Math.pow(a, 3));
	}
}