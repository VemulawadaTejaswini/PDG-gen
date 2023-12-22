import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] t = new int[n+1];
      int sum = 0;
      for(int i = 1;i <= n;i++){
        t[i]=sc.nextInt();
        sum += t[i];
      }
      int m = sc.nextInt();
      int[] p = new int[m+1];
      int[] x = new int[m+1];
      for(int i = 1;i <= m;i++){
      	p[i] = sc.nextInt();
        x[i] = sc.nextInt();
      }
      for(int i = 1;i <= m;i++){
      	System.out.println(sum-t[p[i]]+x[i]);
      }
    }
}