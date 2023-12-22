import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] a = new long[n+1];
      long[] b = new long[n];
      long cnt = 0;
      for(int i = 0;i < n+1;i++)a[i] = sc.nextLong();
      for(int i = 0;i < n;i++)b[i] = sc.nextLong();
      
      for(int i = 0;i < n;i++){
      	long x = Math.min(a[i],b[i]);
        cnt += x;
        a[i] -= x;
        b[i] -= x;
        long y = Math.min(a[i+1],b[i]);
        cnt += y;
        a[i+1] -= y;
        b[i] -= y;
      }
      System.out.println(cnt);
    }
}
