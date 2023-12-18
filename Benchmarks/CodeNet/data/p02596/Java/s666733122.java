import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		// スペース区切りの整数の入力
		long b = 0;
		long c = 7;
      boolean d = true;
		for(long i = 0; i < a && d; i++){
			c = c * 10;
          c = c % a;
			b += c;
			if(b % a == 0){
				System.out.println(i + 1);
              d = false;
			}
		} 
      if(d){
			System.out.println("-1");
		}

		
		
	}
}