import java.util.*;

public class Main {
	
	public static void main(String[] args) {
      
        // flag
        boolean flag = false;

		// argumentの取得
		Scanner sc = new Scanner(System.in);

		Integer x = sc.nextInt();
        String  y = sc.next();
      
        //System.out.println(x);
        //System.out.println(x.length());
      
        if (x % 2 == 0) {
          //System.out.println("yの文字数: " + y.length());
          
          // 判定ロジック
          String firstHalf = y.substring( 0,  y.length()/2);
          String secondHalf = y.substring( y.length()/2,  y.length());
          
          if (firstHalf.equals(secondHalf)) {
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }
          
          //System.out.println("前半分: " + firstHalf);
          //System.out.println("後ろ半分: " + secondHalf);
        } else {
          System.out.println("No");
        }
      
      
	} 
}