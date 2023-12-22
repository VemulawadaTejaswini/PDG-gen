import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n,ans = 0;
      
        for(int i = 1;i <= 5;i++){
			n = sc.nextInt();
          if(n == 0){
            ans = i;
            continue;
          }
        }

        System.out.println(ans);
    }
}