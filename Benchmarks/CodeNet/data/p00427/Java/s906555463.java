import java.lang.*;
import java.lang.Number.*;
import java.math.*;
import java.util.*;

class Main{
    public static void main(String  []s ){
	Scanner sc = new Scanner(System.in);
	while(true){
	    int n,k,m,r;
	    BigDecimal ans=new BigDecimal(0);
	    n = sc.nextInt();
	    k = sc.nextInt();
	    m = sc.nextInt();
	    r = sc.nextInt();
	    if(n==0&&k==0&&m==0&&r==0)break;
	    BigDecimal bdn = new BigDecimal(n);
	    if(m == 0){
		ans = BigDecimal.ONE.divide(bdn,r+10,BigDecimal.ROUND_DOWN);
	    }else{
		ans = BigDecimal.ONE.divide(bdn,r+10,BigDecimal.ROUND_DOWN);
		BigDecimal bdtmp = new BigDecimal(0);
		for(int i = 1; i < n; ++i){
		    bdtmp = bdtmp.add(BigDecimal.ONE.divide(new BigDecimal(i),r+10,BigDecimal.ROUND_DOWN));
		}
		bdtmp = bdtmp.multiply(ans);
		ans = ans.add(bdtmp);
	    }
	    System.out.println( ans.divide(BigDecimal.ONE,r,BigDecimal.ROUND_DOWN) );
	}
    }
}