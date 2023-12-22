import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String c = sc.next();
    String[] strAry = {"a", "i", "u", "e", "o"};
    String ans = "consonant";
    for(String s : strAry){
       if(s.equals(c)){
           ans = "vowel";
       } 
    }
     System.out.println(ans);
  }
}