import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String s = scan.next(),str;
    int cnt = 0;
    while(!(str = scan.next()).equals("END_OF_TEXT")){
      if(str.equalsIgnoreCase(s)) cnt++;
    }
    out.println(cnt);
  }
}