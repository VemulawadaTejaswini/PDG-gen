import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double w = scan.nextDouble();
		double h = scan.nextDouble();
		double x = scan.nextDouble();
		double y = scan.nextDouble();

		System.out.print(w * h / 2);
		System.out.print(" ");
		if(x + x == w && y + y == h) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}
}
