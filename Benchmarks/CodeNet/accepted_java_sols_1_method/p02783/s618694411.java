import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double H = sc.nextInt();
		double A = sc.nextInt();
		double ans = Math.ceil(H / A);
		System.out.println((int) ans);
		sc.close();
	}
	
}