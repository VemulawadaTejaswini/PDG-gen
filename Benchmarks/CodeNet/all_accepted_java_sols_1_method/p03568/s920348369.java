import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int count = 0;
        int ans;
        int tmp;
        for(int i = 0;i < n;i++){
          tmp = sc.nextInt();
          if(tmp % 2 == 0){
            count += 1;
          }
        }
        ans = (int)Math.pow(3, n) - (int)Math.pow(2, count);
        
        System.out.println(ans);
    }
}