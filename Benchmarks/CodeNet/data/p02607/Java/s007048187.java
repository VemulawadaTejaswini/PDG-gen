import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int b[] = new int[a];
        int ans = 0;
        int i;
        for(i = 0;i < a;i++){
          b[i] = sc.nextInt();
          if(i % 2 == 1 && b[i] % 2 == 1){
            ans += 1;
          }
        }
        
      	System.out.println(ans);
 
    }
}