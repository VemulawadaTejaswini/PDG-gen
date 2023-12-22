import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    int n = S.length();
    
    long ans = 0L;
    for(int i = 0; i < Math.pow(2, n - 1); i++){
      StringBuffer sb = new StringBuffer(S);
      for(int j = n - 1; 0 <= j; j--){
        if((1&i>>j) == 1){
           sb.insert(j + 1,"+");
        }
      }
      //System.out.println(sb); 
      String[] array = sb.toString().split("\\+", 0);
      for(int l = 0; l < array.length; l++){
        ans += Long.parseLong(array[l]);
      } 
    } 
    System.out.println(ans);
  }
}