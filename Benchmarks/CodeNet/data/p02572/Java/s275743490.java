import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        long b[] = new long[a];  
        long ans = 0;
      
       for(int i = 0;i < a;i++){
         b[i] = sc.nextLong() % 1000000007;
       }
      
       for(int i = 0;i < a;i++){
        for(int j = i + 1; j < a;j++){
            ans += (b[i] * b[j]) % 1000000007;
            ans  = ans % 1000000007;
        }
       }
        System.out.println(ans);
    }
}