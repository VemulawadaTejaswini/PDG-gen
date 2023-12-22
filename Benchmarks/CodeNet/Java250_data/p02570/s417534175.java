import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double d  = sc.nextDouble();
		double t  = sc.nextDouble();
		double s  = sc.nextDouble();

		System.out.println(d / s <= t ? "Yes" : "No");
		sc.close();
	}
}


