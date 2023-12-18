import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double P = 0;
		
		P = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		Math.sqrt(P);
		
		System.out.printf("%.8f\n",Math.sqrt(P));

	}
}
