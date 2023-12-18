import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    String S = sc.next();
    int check =0;
    for (int i=0; i<3; i++) {
      if (S.charAt(i) == S.charAt(i+1)) {
        check++;
      }
    }
    if (check != 0) {
      System.out.println("Bad");
    } else {
      System.out.println("Good");
    }
  }
}