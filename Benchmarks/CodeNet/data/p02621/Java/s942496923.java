import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();

		System.out.println(a + a * a + a * a * a);

	}
}