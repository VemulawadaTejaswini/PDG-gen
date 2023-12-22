import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double L = 0;
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt();
		double X = (L / 3) * (L / 3) * (L / 3);
		//String max = BigDecimal.valueOf(X).toPlainString();
		System.out.println(X);
		sc.close();
	}
}