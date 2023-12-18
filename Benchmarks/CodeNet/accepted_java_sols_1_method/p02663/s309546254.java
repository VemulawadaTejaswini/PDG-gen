import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      //取得
	  int H1 = sc.nextInt();
      int M1 = sc.nextInt();
      int H2 = sc.nextInt();
      int M2 = sc.nextInt();
      int K = sc.nextInt();
      //分換算
      int okiru = H1*60+M1;
      int neru = H2*60+M2;
      //起きてる時間
      int time = neru-okiru;
      
      System.out.println(time-K);
    }
}