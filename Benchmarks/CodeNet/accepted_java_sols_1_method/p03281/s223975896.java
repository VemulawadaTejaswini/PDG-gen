import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    sc.close();

    int count = 0;

    for (int i = 105; i <= N; i++) {
      
      int count_ = 0;

      if (i % 2 == 1) { 
      
        for (int j = 1; j <= i; j++) {
          if (i % j == 0) {
            count_++;
          }
        }

      }

      if (count_ == 8) {
        count++;
      }

    }

    System.out.println(count);

  }

}