import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int a = 1,b = n - 1;
        int check1 = 0, check2 = 0;
        int ans = 9999999;
        for(int i = 0; i < n;i++){
			check1 = a / 100000 + (a / 10000) % 10 + (a / 1000) % 10 
              + (a / 100) % 10 + (a / 10) % 10 + a % 10;
            check2 = b / 100000 + (b / 10000) % 10 + (b / 1000) % 10 
              + (b / 100) % 10 + (b / 10) % 10 + b % 10;
          if(check1 + check2 < ans && check1 * check2 != 0){
            ans = check1 + check2;
          }
          a++;
          b--;
        }
      
        
      	System.out.println(ans);
 
    }
}