import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
        
        long start = (a + x - 1) / x;
        long end = (b + x - 1) / x;
        long ans = start == end ? 0 : end - start;
        if (b % x == 0) {
          ans++;
        }
    
		// 出力
		System.out.println(ans);
	}
}