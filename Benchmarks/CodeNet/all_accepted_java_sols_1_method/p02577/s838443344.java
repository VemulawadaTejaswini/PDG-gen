import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char[] kurai = N.toCharArray();
    
    int sum = 0;
    for(int i = 0; i < kurai.length; i++){
      int k = Character.getNumericValue(kurai[i]);
      sum += k;
    }
    
    
    
    if(sum%9 == 0){
      System.out.println("Yes");
      return;
    }else{
      System.out.println("No");
      return;
    }
    
  }
}