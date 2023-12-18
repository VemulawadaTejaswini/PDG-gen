import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String S_ = sc.next();
    String[] S = S_.split("");
    sc.close();

    int[] E = new int[N];
    int countE = 0; 

    for (int i = 0; i < N; i++) {
      if (S[i].equals("E")) {
        countE++;
      }
      E[i] = countE;
    }

    int min = Integer.MAX_VALUE;

    for (int i = 0; i < N; i++) {
      int count_ = 0;
      // i より西にあるWの数
      if (i != 0) {
        if (S[i].equals("E")) {
          count_ += i + 1 - E[i];
        } else {
          count_ += i - E[i];
        }
      }

      // i より東にあるEの数
      if (i != N-1){
        count_ += E[N-1] - E[i];
      }

      min = Math.min(min, count_);

    }

    System.out.println(min);

  }

}