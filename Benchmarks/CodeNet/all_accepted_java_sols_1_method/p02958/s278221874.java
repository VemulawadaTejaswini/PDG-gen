import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

      int[] p = new int[n];
      for(int i = 0; i < n ; i++) {
        p[i] = sc.nextInt();
      }
      
      int cnt = 0;
      for(int i = 1; i <= n; i++) {
        if(p[i-1] != i) 
          cnt++;
      }
      
      if((cnt==0)|| (cnt==2)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
      

    
    }
}