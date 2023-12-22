
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double W = sc.nextInt();
		double H = sc.nextInt();
		double x = sc.nextInt();
		double y = sc.nextInt();
		sc.close();
		
		double half = H/2;
		double area = half*W;
		System.out.printf("%.8f",area);
		
		if (x==0 && y==0)
			System.out.println(" "+0);
		
		else if (x==W/2 && y==H/2)
			System.out.println(" "+1);
		else
			System.out.println(" "+0);
	}

}
