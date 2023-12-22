import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int sum = 0;
    for(int i = 0; i < str.length(); i++){
      //System.out.println(str.charAt(i));
      sum += Character.getNumericValue(str.charAt(i));
      //System.out.println(sum);
    }
      //System.out.println(sum);
    
    if (sum==0 || sum%9==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}