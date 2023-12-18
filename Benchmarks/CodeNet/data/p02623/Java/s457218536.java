import java.util.*;

public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      int k = sc.nextInt();
      
      int a[] = new int[n];
      int b[] = new int[m];
      
      for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
      }
      
      for(int i = 0; i < m; i++){
        b[i] = sc.nextInt();
      }
      
      Arrays.sort(a);
      Arrays.sort(b);
      
      int result = xxx(0, a, b, 0, 0, k);
      
      System.out.print(result);
    }
  
    public static int xxx(int cnt, int[] a, int[] b, int a_i, int b_i, int k){
    	int k_temp = 0;
        if(a_i < a.length)
        	k_temp = k - a[a_i];
      	int cnt_a = cnt;
      
      	if(k_temp >= 0)
      	  cnt_a = xxx(cnt+1, a, b, a_i+1, b_i, k_temp);
      
        if(b_i < b.length)
      	  k_temp = k - b[b_i];
      	int cnt_b = cnt;
      	if(k_temp >= 0)
      	  cnt_b = xxx(cnt+1, a, b, a_i, b_i+1, k_temp);
      
        if(cnt_a >= cnt_b)
          return cnt_a;
        else
          return cnt_b;
    }
}
