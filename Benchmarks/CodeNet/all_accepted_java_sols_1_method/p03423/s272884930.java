import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
    
		// 出力
		System.out.println((n - (n % 3)) / 3);
	}
}
