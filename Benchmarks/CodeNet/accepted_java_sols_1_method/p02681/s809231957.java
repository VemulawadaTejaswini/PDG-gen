import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c1 = s.toCharArray();
    String t = sc.next();
    char[] c2 = t.toCharArray();

    if(c1.length+1 == c2.length){
      for(int i=0; i<c1.length; i++){
        if(c1[i]!=c2[i]){
          System.out.println("No");
          return ;
        }  
      }
      System.out.println("Yes");
      return;
    }

    System.out.println("No");

  }
}
