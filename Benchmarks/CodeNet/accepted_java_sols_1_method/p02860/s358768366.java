import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String k = s.substring(0,n/2);
    String l = s.substring(n/2,n);


    if (k.equals(l)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
