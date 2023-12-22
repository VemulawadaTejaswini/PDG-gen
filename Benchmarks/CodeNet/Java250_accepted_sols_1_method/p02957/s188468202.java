import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int sum = a + b;
    
		// 出力
		System.out.println((sum) % 2 == 0 ? sum / 2 : "IMPOSSIBLE");
	}
}