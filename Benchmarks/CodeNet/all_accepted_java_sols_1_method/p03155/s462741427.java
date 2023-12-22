import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int h = sc.nextInt();
        int w = sc.nextInt();
    
		// 出力
		System.out.println((n - h + 1) * (n - w + 1));
	}
}