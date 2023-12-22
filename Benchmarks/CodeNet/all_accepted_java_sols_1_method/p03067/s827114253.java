import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
      
        if (a > b) {
          // 出力
		  System.out.println(c > b && a > c ? "Yes" : "No");
        } else {
          // 出力
		  System.out.println(c < b && a < c ? "Yes" : "No");
        }
	}
}
