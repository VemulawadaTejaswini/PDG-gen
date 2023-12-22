import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
        int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans = "";
        if (b > a) {
          int gap = b - a;
          if (gap > x) {
            ans = "dangerous";
          } else {
            ans = "safe";
          }
        } else {
          ans = "delicious";
        }
    
		// 出力
		System.out.println(ans);
	}
}
