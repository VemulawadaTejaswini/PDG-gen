import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
      	long ans = sc.nextLong();
      	BigDecimal x = BigDecimal.valueOf(ans);
      	BigDecimal sum = BigDecimal.valueOf(100);
      	BigDecimal foo = BigDecimal.valueOf(1.01);
      	for(int i = 1 ; sum.compareTo(x) == -1; i++){
			sum = sum.multiply(foo).setScale(0, BigDecimal.ROUND_DOWN);
          if(sum.compareTo(x) >= 0){
          System.out.println(i);
        	}
        }

		
	}
}

