import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int standard = 1;
        while (true) {
          int target = standard * 2;
          if (target <= n) {
            standard = target;
          } else {
            break;
          }
        }
        
		// 出力
		System.out.println(standard);
	}
}