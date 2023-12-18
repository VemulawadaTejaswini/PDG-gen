import java.util.*;

public class Main {
  public static void main(String[] args){
    new Main().run();    
  }

  long N;
  List<Long> A = new ArrayList<>();

  void run() {
    Scanner sc = new Scanner(System.in);
    N = sc.nextLong();
    for (long i = 0; i < N; i++) {
      A.add(sc.nextLong());
    }

    long canDiv = 0;

    for (long i : A) {
      boolean flg = false;
      for (long j : A) {
        if (i == j && !flg) {
          flg = true;
          continue;
        }
        if (i % j == 0) {
          canDiv ++;
          break;
        }
      }
    }

    System.out.println(N - canDiv);
  }
}
