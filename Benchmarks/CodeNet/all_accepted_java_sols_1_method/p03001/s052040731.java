import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double W = sc.nextDouble();
		double H = sc.nextDouble();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double half = W * H / 2;
		System.out.print(half + " ");
		
		if((a == W / 2) && (b == H / 2)) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}
	}

}