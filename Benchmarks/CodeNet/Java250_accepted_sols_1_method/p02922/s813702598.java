import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
 
        if(b == 1){
          System.out.println(0);
          return;
        }
        if(a >= b){
          System.out.println(1);
          return;
        }
        
        int num = a;
        int count = 2;
      
        while(true){
          num += a - 1;
          if(num >= b){
            break;
          }
          count++;
        }
		// 出力
		System.out.println(count);
	}
}