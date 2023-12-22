import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int d = sc.nextInt();
        int ab = a + b;
        int cd = c + d;
        String ans = "";
        if (ab == cd) {
          ans = "Balanced";
        } else if (ab > cd) {
          ans = "Left";
        } else {
          ans = "Right";
        }
    
		// 出力
		System.out.println(ans);
	}
}
