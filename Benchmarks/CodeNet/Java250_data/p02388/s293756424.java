import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		BigDecimal bd = new BigDecimal(i);
		System.out.println(bd.pow(3));
	}

}