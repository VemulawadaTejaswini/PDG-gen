import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    String answer = "";

    if (N == 0) {
      answer = "0";
    } else {
      while (N != 0) {
        if (N % 2 != 0) {
          N--;
          answer = "1" + answer;
        } else {
          answer = "0" + answer;
        }
        N = N / -2;
      }
    }

    System.out.println(answer);

  }

}