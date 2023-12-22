import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if ( S.substring(2,3).equals(S.substring(3,4)) ){
      if (S.substring(4,5).equals(S.substring(5,6)) )
      { System.out.println("Yes");
      }
      else
        System.out.println("No");
    }
    else
      System.out.println("No");
  }
}