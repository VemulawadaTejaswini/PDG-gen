import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
        int amari = n % k;
        int avg = (n - amari) / k;
          
		// 出力
		System.out.println(amari == 0 ? 0 : 1);
	}
}
