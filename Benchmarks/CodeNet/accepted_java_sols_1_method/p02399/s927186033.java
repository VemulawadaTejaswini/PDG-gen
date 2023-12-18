
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = a/b;
		int y = a%b;
		double sum = (double)a / b;
		System.out.format("%d %d %.5f", x,y,sum);
	}
}

