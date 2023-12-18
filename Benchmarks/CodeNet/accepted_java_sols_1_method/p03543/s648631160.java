import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String N = sc.next();

    String N1 = N.substring(0,1);
    String N2 = N.substring(1,2);
    String N3 = N.substring(2,3);
    String N4 = N.substring(3,4);

    if (N1.equals(N2) && N1.equals(N3)) {
      System.out.println("Yes");
    } else if (N2.equals(N3) && N2.equals(N4)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}