import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    String[] D = new String[K];

    for (int i = 0; i < K; i++) {
      D[i] = sc.next();
    }

    sc.close();

    boolean flg = true;

    while (flg) {

      String n = String.valueOf(N);

      boolean hasD = false;

      for (int i = 0; i < K; i++) {
        if (n.indexOf(D[i]) != -1) {
          hasD = true;
          break;
        }
      }

      if (hasD){
        N++;
      } else {
        flg = false;
      }

    }

    System.out.println(N);
    
  }

}