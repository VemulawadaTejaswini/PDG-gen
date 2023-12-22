import java.util.*; 
import java.math.BigDecimal;

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
  		BigDecimal a=sc.nextBigDecimal();
  		BigDecimal b=sc.nextBigDecimal();
  		BigDecimal c=a.multiply(b);
  		BigDecimal ans=c.setScale(0,BigDecimal.ROUND_DOWN);
  		System.out.println(ans);
    }
}