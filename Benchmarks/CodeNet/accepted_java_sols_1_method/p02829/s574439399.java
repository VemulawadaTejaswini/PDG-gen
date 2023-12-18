import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		// argumentの取得
		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
        int y = s.nextInt();
      
        if (x + y == 5){
          System.out.println(1);
        } else if (x + y == 4) {
          System.out.println(2);
        } else {
          System.out.println(3);
        }
           
		// 戻り値の返却
		//System.out.println(x+y);
	
	} 
}