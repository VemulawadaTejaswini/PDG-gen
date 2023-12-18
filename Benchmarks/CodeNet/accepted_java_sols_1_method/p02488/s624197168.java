import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String max = "zzzzzzzzzzzzzzzzzzzzzz";
    for(int i=0;i<n;i++){
      String str = scan.next();
      if(max.compareTo(str) > 0) max = str;
    }
    out.println(max);
  }
}