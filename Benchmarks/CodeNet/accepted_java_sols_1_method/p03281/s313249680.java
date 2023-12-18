import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int count = 0;
        int ans = 0;
		for(int i = 1;i <= n; i++){
          for(int j = 1;j <= i;j++){
            if(i % j == 0){
              count += 1;
            }
          }
          if(count == 8){
            ans += 1;
          }
          count = 0;
          i++;
          
        }
      
      System.out.println(ans);
      
    }
}