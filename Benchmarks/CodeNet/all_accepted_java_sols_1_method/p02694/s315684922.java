import java.util.*;
import java.math.BigDecimal;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
       BigDecimal k = BigDecimal.valueOf(sc.nextLong());       
      BigDecimal money = BigDecimal.valueOf(100.0);  
       BigDecimal a = BigDecimal.valueOf(1.01);
        int cnt = 0;
        while(money.compareTo(k) == -1){
        	cnt+=1;
        	money=money.multiply(a);
            BigDecimal bd1 = money.setScale(0, BigDecimal.ROUND_DOWN);
          money = bd1;
        }
   	System.out.println(cnt);            

	}
}