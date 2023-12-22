import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    String s_ = sc.next();

    sc.close();
    
    String[] S = s_.split("");

    for (int i = 0; i < S.length; i++) {
      if (i == K - 1) {
        if (S[i].equals("A")) {
          S[i] = "a";
        }
        if (S[i].equals("B")) {
          S[i] = "b";
        }
        if (S[i].equals("C")) {
          S[i] = "c";
        }
      }
    }

    for (int i = 0; i < S.length; i++) {
      System.out.print(S[i]);
    }

    System.out.println("");

  }

}