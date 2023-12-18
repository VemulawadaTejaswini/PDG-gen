import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for(;;){
      long a, d, n;
      a = ni();
      d = ni();
      n = ni();
      
      if((a|d|n)==0) break;
      
      int cnt = 0;
      for(long ite = a;;ite += d) {
        boolean f = true;
        f = 2 <= ite;
        for(int j = 2; j*j < ite; ++j) {
          f &= ite % j != 0;
        }
        if(f) {
          if(++cnt == n) {
            System.out.println(ite);
            break;
          }
        }
      }
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  String ns() {
    return sc.next();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}