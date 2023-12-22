import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      String C = sc.next();
      char c = C.charAt(0);
      int i = 0;
      char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',  'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
      while(true){
        if(alpha[i]==c){
          System.out.println(alpha[i+1]);
          break;
        }else{
          i++;
        }
      }
  }
}
