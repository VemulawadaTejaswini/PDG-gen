import java.util.*;
import java.util.regex.Pattern;
 
 public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    String n = sc.next();
    
    String ans = "a";
    
    if(Pattern.matches("^[A-Z]+$", n)){
      ans = "A";
    }
    
    System.out.println(ans);

  }
}