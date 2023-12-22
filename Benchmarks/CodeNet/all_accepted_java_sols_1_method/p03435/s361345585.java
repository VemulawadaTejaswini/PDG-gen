import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      //取得
      int[] c = new int[9];
      for(int i=0; i<9; ++i){
        c[i] = sc.nextInt();
      }
      int d1 = c[1]-c[0];
      int d2 = c[2]-c[1];
      String ans = "Yes";
      if(c[4]!=c[3]+d1){
        ans="No";
      } if(c[7]!=c[6]+d1){
        ans="No";
      } if(c[5]!=c[4]+d2){
        ans="No";
      } if(c[8]!=c[7]+d2){
        ans="No";
      }
      System.out.println(ans);
	}
}