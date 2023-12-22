import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		System.out.println(a/b + " " + a % b + " " + String.format("%.5f", (float)a/b));
//		System.out.printf("%d %d %.10f%n", a/b, a%b, (double)a/(double)b);
		System.out.printf("%d %d %f%n", a/b, a%b, (double)a/b);
// 		System.out.printf("%d %d %d%n", a/b, a%b, BigDecimal.valueOf(double)a/b.toPlainString());
		
	}

}
