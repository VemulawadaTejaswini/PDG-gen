import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int i;
        int h[] = new int[n];
        int count = 0;
        int ans = 0;
        for(i = 0; i < n; i++){
      	  h[i] = sc.nextInt();
          if(i >= 1 && h[i- 1] >= h[i]){
            count += 1;
          }else{
            count = 0;
          }
          
          if(ans < count){
            ans = count;
          }
        }
		
        
      	System.out.println(ans);
 
    }
}