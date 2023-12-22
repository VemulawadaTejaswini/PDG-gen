import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	int n = sc.nextInt();
        int k = sc.nextInt();
        int h[] = new int[n];
        long ans = 0;
        int i;
        if(n <= k){
          System.out.println(ans);
          return;
        }
          
        for(i = 0;i < n;i++){
          h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        for(i = n - 1;i >= n - k;i--){
          h[i] = 0;
        }
      
        for(i = 0;i < n;i++){
          ans += h[i];
        }
        System.out.println(ans);
        
    }
}