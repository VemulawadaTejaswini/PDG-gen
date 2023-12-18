import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String s;
    while(!(s = scan.next()).equals("-")){
    int n = scan.nextInt();
    for(int i=0;i<n;i++){
      int h = scan.nextInt();
      s = s.substring(h) + s.substring(0,h);
    }
    out.println(s);
    }
  }
}