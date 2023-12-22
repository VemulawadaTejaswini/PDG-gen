import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] h = new int[n];
        int ans = 1;
        for(int i = 0; i < n; i++){
          h[i] = sc.nextInt();
        }
        
        for(int i = 1; i < n; i++){
          int num = 0;
          for(int j = 0; j < i; j++){
            if(h[i] >= h[j]){
              num++;
            }
          }
          
          if(num == i){
            ans++;
          }
        }
      
        System.out.println(ans);
	}
}