import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int M = sc.nextInt();
    int D = sc.nextInt();

    sc.close();

    int count = 0;

    for (int i = 2; i <= M; i++) {

      for (int A = 2; A < 10; A++) {
        if (i % A != 0) {
          continue;
        }
        int B = i / A;
        if (B < 10 && 1 < B) {
          if ((A * 10 + B) <= D) {
            count++;
          }
        }
      }
      
    }

    System.out.println(count);

  }

}