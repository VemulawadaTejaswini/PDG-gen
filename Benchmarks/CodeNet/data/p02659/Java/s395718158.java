import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		
		BigDecimal bd = new BigDecimal(String.valueOf(b));
		BigDecimal bd1 = bd.setScale(2, RoundingMode.DOWN);
		long ans = (long) ((long)a*b);
		
		System.out.println(ans);
	}

}