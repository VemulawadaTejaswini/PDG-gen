import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] x = new long[n];
      long[] y = new long[n];
      long[] h = new long[n];
      long X = 0;
      long Y = 0;
      long H = 0;
      for(int i = 0;i < n;i++){
      	x[i]=sc.nextLong();
        y[i]=sc.nextLong();
        h[i]=sc.nextLong();
      }
      for(int i = 0;i < n;i++)
        if(h[i]!=0){
          X = x[i];
          Y = y[i];
          H = h[i];
          break;
        }
      for(long cx = 0;cx <= 100;cx++){
      	for(long cy = 0;cy <= 100;cy++){
          boolean cnt = true;
          long H0 = H+Math.abs(cx-X)+Math.abs(cy-Y);
          for(int i = 0;i < n;i++){
          	if(h[i]!=Math.max(0,H0-Math.abs(x[i]-cx)-Math.abs(y[i]-cy)))cnt = false;
          }
          if(cnt){
          	System.out.println(cx+" "+cy+" "+H0);
            return;
          }
        }
      }
    }
}
