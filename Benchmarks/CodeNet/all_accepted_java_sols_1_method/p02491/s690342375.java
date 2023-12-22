import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int d = 0;
		if(b != 0){
			d = a / b;
		}
		else{
			System.out.println("ゼロ除算");
			System.exit(0);
		}
		
		int r = a % b;

		double f = (double)a / (double)b;

		System.out.printf("%d %d %.5f", d, r, f);
	}
}