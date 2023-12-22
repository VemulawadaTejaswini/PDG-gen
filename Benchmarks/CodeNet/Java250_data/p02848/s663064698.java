import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        String a = sc.next();
        char[] bun = a.toCharArray();
        for(int i = 0; i < bun.length;i++){
          if((int)bun[i] + n > 90){
            bun[i] = (char)(((int)bun[i] + n - 90) + 64);
          }else{
            bun[i] = (char)((int)bun[i] + n);
          }
          
        }
        
      
        for(int i = 0; i < bun.length;i++){
          System.out.print(bun[i]);
        }
        System.out.println();
    }
}