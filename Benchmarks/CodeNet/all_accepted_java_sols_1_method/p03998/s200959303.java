import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String SA = sc.next();
    String SB = sc.next();
    String SC = sc.next();
    
    String result = "";
    int a = 0;
    int b = 0;
    int c = 0;
    char next = 'a';
    while(true){
      if(next == 'a'){
        if(a == SA.length()){
          result = "A";
          break;
        }else{
          next = SA.charAt(a);
          a++;
        }
      }else if(next == 'b'){
        if(b == SB.length()){
          result = "B";
          break;
        }else{
          next = SB.charAt(b);
          b++;
        }
      }else{
        if(c == SC.length()){
          result = "C";
          break;
        }else{
          next = SC.charAt(c);
          c++;
        }
      }
    }
    System.out.println(result);
  }
}