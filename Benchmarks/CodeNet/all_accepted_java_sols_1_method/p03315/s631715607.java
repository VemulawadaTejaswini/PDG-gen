import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int ans =0;
      for(int i=0;i<4;i++){
        if(str.charAt(i)=='+'){
          ans += 1; 
        }else{
          ans -= 1;
        }
      }
      System.out.println(ans);
    }
}
