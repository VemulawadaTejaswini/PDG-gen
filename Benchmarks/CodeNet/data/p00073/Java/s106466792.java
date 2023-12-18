import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x, h, h2 = 0;

		while(true){
			x = sc.nextInt();
			h = sc.nextInt();
			if(x == 0 && h == 0) break;

			h2 = Math.sqrt(Math.pow(x / 2, 2) + Math.pow(h, 2));

			System.out.println(x * x + 2 * x * h2);
		}
	}
}