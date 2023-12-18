import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		
        int m = n%x==0 ? n/x : n/x+1;
      // 出力
		System.out.println("" + (m*t));
	}
}