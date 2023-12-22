import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S_ = sc.next();

    sc.close();

    String[] S = S_.split("");

    int start = 0;
    
    for (int i = 0; i < S.length; i++) {

      if (S[i].equals("A")) {
        start = i;
        break;
      }

    }

    int end = 0;

    for (int i = S.length - 1; 0 <= i; i--) {

      if (S[i].equals("Z")) {
        end = i;
        break;
      }

    }

    System.out.println(end - start + 1);

  }

}