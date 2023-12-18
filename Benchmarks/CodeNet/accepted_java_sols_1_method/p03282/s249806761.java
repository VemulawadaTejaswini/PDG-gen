import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S_ = sc.next();
    long K = sc.nextLong();

    sc.close(); 

    String[] S = S_.split("");

    long result = 1;
    long i = 0;

    while (i < K) {
      if (!S[(int)i].equals("1")) {
        result = Integer.valueOf(S[(int)i]);
        break;
      }
      i++;
    }

    System.out.println(result);

  }

}