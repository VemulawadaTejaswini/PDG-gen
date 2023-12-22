import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next(), T = sc.next();
    int num=0;
    for(int i=0; i<S.length(); i++) {
      if(!S.substring(i,i+1).equals(T.substring(i,i+1))) {
        num++;
      }
    }
    System.out.println(num);
  }
}