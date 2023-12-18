import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt(),p1 = 0,p2 = 0;
    for(int i=0;i<n;i++){
      String s1 = scan.next(),s2 = scan.next();
      if(s1.compareTo(s2) == 0){p1++;p2++;}
      else if(s1.compareTo(s2) > 0) p1+=3;
      else p2 += 3;
    }
    out.println(p1 + " " + p2);
  }
}