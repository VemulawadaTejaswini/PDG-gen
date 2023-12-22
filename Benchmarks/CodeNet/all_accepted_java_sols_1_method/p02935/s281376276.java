import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      //入力
      int g =sc.nextInt();//具材の数
      int val[] = new int[g];
      
      //具の価値を配列へ
      for(int i =0; i<g; i++){
        	val[i] = sc.nextInt();
      }
      //昇順に並び替え
      Arrays.sort(val);
      
      double ans = val[0];
      
      for(int i=1; i<g; i++){
        	 ans = (ans+val[i])/2.0;
      }
      System.out.println(ans);
    }
}
      