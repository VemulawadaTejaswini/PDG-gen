import java.util.*;
import java.lang.Math.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		long syaink = sc.nextLong();
        BigDecimal ss = BigDecimal.valueOf(syaink);
        double syainj = sc.nextDouble();
        BigDecimal ssc =BigDecimal.valueOf(syainj);
      BigDecimal b3 = ss.multiply(ssc);
      BigDecimal result3 = b3.setScale(0, BigDecimal.ROUND_DOWN);
      System.out.println(result3);
}
}