import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
      	//BigDecimalで入力
      	BigDecimal A = sc.nextBigDecimal();
		BigDecimal B= sc.nextBigDecimal();
      
      	//sekiにAとBをかけたものを代入する
		BigDecimal seki = B.multiply(A);
      
      	//long型に変えて出力する
		long C = seki.longValue();
		System.out.println(C);
	}
}