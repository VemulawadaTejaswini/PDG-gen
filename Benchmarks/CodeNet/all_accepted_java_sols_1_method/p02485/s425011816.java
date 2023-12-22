import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    while(true){
      String str = scan.next();
      if(str.equals("0")) break;
      int sum = 0;
      for(int i=0;i<str.length();i++){
        sum += str.charAt(i) - '0';
      }
      out.println(sum);
    }
  }
}