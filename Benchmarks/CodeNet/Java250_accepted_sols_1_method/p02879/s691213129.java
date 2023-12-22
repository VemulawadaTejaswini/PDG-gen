import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		// argumentの取得
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
	    int y = sc.nextInt();
      
		// 戻り値の返却
        if ( x < 10 && y < 10) {
          System.out.println(x * y);
        } else {
          System.out.println(-1);
        }
		
	
	} 
}