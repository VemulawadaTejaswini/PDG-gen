import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		// argumentの取得
		Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        String ans = "No";

        // debug
        // System.out.println(x);
        // System.out.println(y);
      
        for (int i = 0; i < x + 1; i++){
          Integer sum = 2 * i + 4 * (x - i);
          if (sum == y)
            ans = "Yes";
        }
      
		// 戻り値の返却
		System.out.println(ans);
	
	} 
}