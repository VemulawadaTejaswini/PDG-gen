import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
      	long k = sc.nextLong();
		long i;
        long ans = k;
        if(n == 1){
          System.out.println(k);
          System.exit(0);
        }
        for(i = 1;i < n;i++){
          ans *= k - 1;
        }
            System.out.println(ans);   
    }
}