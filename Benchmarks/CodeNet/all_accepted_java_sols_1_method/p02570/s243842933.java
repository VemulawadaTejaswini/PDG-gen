import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double D = sc.nextInt();
		 double T = sc.nextDouble();
		 double S = sc.nextInt();
		 double x = D/S;
		 if(T >= x) {
			 System.out.println("Yes");
		 }else {
			 System.out.println("No");
		 }
	}
}