import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String s = sc.next();
    sc.close();

    String[] S = s.split("");

    int answer = 1;
    String current = S[0];

    for (int i = 0; i < N; i++) {
      if (!current.equals(S[i])) {
        current = S[i];
        answer++;
      }
    }

    System.out.println(answer);

  }

}