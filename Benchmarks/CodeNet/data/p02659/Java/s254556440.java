import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		
		BigDecimal bd1 = new BigDecimal(a);
		BigDecimal bd2 = new BigDecimal(b);
		BigDecimal total = bd1.multiply(bd2);
		
		BigDecimal bd = total.setScale(0, BigDecimal.ROUND_DOWN);
		
		System.out.println(bd);
	}

}