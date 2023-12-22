import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
      
        String ans = "";
        if (a == b) {
          ans = "Draw";
        } else if (a > b) {
          ans = b == 1 ? "Bob" : "Alice";
        } else if (a < b) {
          ans = a == 1 ? "Alice": "Bob";
        }
    
		// 出力
		System.out.println(ans);
	}
}
