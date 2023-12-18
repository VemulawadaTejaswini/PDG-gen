import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int v=sc.nextInt();
      int b=sc.nextInt();
      int w=sc.nextInt();
      double t=sc.nextDouble();
      if(v<=w){
      	System.out.println("NO");
        return;
      }
      int l=Math.abs(a-b);
      int r=v-w;
      BigDecimal L=BigDecimal.valueOf(l);
      BigDecimal R=BigDecimal.valueOf(r);
      BigDecimal T=L.divide(R,1,BigDecimal.ROUND_DOWN);
      double p=T.doubleValue();
      if(p<=t){
      	System.out.println("YES");
      	return;
      }else{
      	System.out.println("NO");
        return;
      }
    }
}