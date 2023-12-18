import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
		int c = sc.nextInt();
        int ans = 0;
        int i;
        for(i = a;i <= b;i++){
          if(i % c == 0){
           ans += 1;
          }
        }
      	System.out.println(ans);
 
    }
}