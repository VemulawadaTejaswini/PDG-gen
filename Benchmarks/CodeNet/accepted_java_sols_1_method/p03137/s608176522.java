import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] x = new int[m];
      int[] y = new int[m-1];
      int res = 0;
      for(int i = 0;i < m;i++)x[i]=sc.nextInt();
      Arrays.sort(x);
      for(int i = 0;i < m-1;i++){
      	y[i]=x[i+1]-x[i];
        res += y[i];
      }
      if(m==1){
        System.out.println(0);
        return;
      }
      Arrays.sort(y);
      for(int i = 1;i < n&&m-1-i>=0;i++)res -= y[m-1-i];
      System.out.println(res);
    }
}