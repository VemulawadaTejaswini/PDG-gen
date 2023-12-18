import java.util.*;
import java.util.regex.Pattern;

public class Main{
  
  public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  
   int a = sc.nextInt();
   int b = sc.nextInt();
   String s = sc.next();
    
  if(a>=1 && a<=5 && b>=1 && b<=5){
    boolean gouhi = Pattern.matches("^[0-9]{"+a+"}-[0-9]{"+b+"}$",s);
    if(gouhi == true){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }else{
    System.out.println("入力値に誤りがあります");
  }
  }
  
}
