import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int v=sc.nextInt();
      int b=sc.nextInt();
      int w=sc.nextInt();
      int t=sc.nextInt();
      if(v<=w){
      	System.out.println("NO");
        return;
      }
      int l=Math.abs(a-b);
      int r=v-w;
      if(!(l%r==0)){
      	System.out.println("NO");
        return;
      }
      if((l/r)<=t){
      	System.out.println("YES");
      	return;
      }else{
      	System.out.println("NO");
        return;
      }
    }
}