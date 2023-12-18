import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =  sc.nextInt();
		int b =  sc.nextInt();
		int r = a % b;
		int d = a / b;
		double f = (double)a / (double)b;
		System.out.print(d + " " + r + " ");
		System.out.printf("%.5f\n",f);
	}
}