import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double x = sc.nextDouble();
			double h = sc.nextDouble();
			if(x == 0 && h == 0)break;
			double t = Math.sqrt(x * x / 4+ h * h);
			double s = x * x + 2 * x * t;
			System.out.println(s);
		}
		sc.close();
	}
}
