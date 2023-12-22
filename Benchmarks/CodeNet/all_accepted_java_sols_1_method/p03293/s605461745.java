import java.util.*;
 
public class Main {
  public static void main(String[] args) {
 	  Scanner sc = new Scanner(System.in);
 
    String s = sc.next();
    String t = sc.next();
 
    boolean answer = false;
 
    for(int i = 0; i < s.length(); i++){
      boolean checker = true;
      for(int j = 0; j < s.length(); j++){
        if(s.charAt(j) != t.charAt((j+i)%s.length())){
          checker = false;
        }
      }
      if(checker){
        answer = true;
        break;
      }
    }
 
    System.out.println(answer? "Yes" : "No"); 
  }
}