import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = 0;
      boolean c = true;
		for(int i = 0; i < a && c; i++){
			b += 7 * Math.pow(10, i);
			if(b % a == 0){
				System.out.println(i + 1);
              c = false;
			}
		}
      if(c){
      	System.out.println("-1");
      }

		
		
	}
}