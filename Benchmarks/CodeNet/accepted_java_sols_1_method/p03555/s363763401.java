import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String n = sc.next();
      String m = sc.next();

      for(int i = 2; i >= 0; i--)
        if(m.charAt(i) != n.charAt(2-i)) {
            System.out.println("NO");
            return;
        }

      System.out.println("YES");
  }
}

