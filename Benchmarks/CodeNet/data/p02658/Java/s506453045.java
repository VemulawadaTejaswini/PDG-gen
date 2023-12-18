import java.util.*;
public class Main {
  public static void main(String[] args){
     new Main().run();
  }

  void run() {
    Scanner sc = new Scanner(System.in);
    long limit = (long)Math.pow(10, 18);
    long N = sc.nextLong();
    long ans = sc.nextLong();

    long i=1;
    try {
      for (; i<N; i++) {
        ans = Math.multiplyExact(ans, sc.nextLong());
      }
    } catch (Exception e) {
      ans = -1;
      i++;
      for (; i<N; i++) {
        if (sc.nextLong() == 0) {
          ans = 0;
        }
      }
    }
    if (limit < ans) {
      ans = -1;
    }

    System.out.println(ans);
  }
}
