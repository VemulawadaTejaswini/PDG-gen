import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
        int sum = 0;
		for(int i = 0; i < n; i++) {
          if (sc.nextInt() >= k) {
            sum++;
          }
        }
    
		// 出力
		System.out.println(sum);
	}
}