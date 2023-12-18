import java.util.*;
import java.math.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String[] sa = S.split("");
    int f0 = 0;
    int f1 = 0;
    for(int i=0; i<S.length(); i++) {
      if(i%2 == 0 && sa[i].equals("1")){
        f0++;
      } else if(i%2 == 1 && sa[i].equals("0")){
        f0++;
      }
    }
    for(int i=0; i<S.length(); i++) {
      if(i%2 == 0 && sa[i].equals("0")){
        f1++;
      } else if(i%2 == 1 && sa[i].equals("1")){
        f1++;
      }
    }
    System.out.println(Math.min(f0, f1));
  }
}
