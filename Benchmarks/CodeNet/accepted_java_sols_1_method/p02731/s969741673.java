import java.util.*; 
import java.math.BigDecimal;

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        BigDecimal n=new BigDecimal(sc.nextDouble());
  		BigDecimal b=new BigDecimal(3);
        BigDecimal a=n.divide(b,8,BigDecimal.ROUND_HALF_UP);
		BigDecimal ans=a.multiply(a);
  		ans=ans.multiply(a);

    	System.out.println(ans);
    }
}