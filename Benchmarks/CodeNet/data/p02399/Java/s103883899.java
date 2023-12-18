import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);

		float aa = Integer.parseInt(ss[0]);
		float bb = Integer.parseInt(ss[1]);
		
		BigDecimal ff = new BigDecimal(aa/bb);

		System.out.print(a / b);
		System.out.print(" ");
		System.out.print(a % b);
		System.out.print(" ");
		System.out.println(ff.setScale(5,BigDecimal.ROUND_HALF_UP));

	}

}