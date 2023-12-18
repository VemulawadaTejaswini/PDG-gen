
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      int max = 0;
      int min = 0;

      for (int i = 0; i < n; i++) {
        int newScan = in.nextInt();

        if (min == 0 ) {
          min = newScan;
        } else if( min > newScan) {

          int tmp =  newScan - min;
          if (max == 0 || tmp > max) {
            max = tmp;
          }
          min = newScan;

        } else {
          int tmp = newScan - min;
          if (max == 0 || tmp > max) {
            max = tmp;
          }

        }
      }


      System.out.println(max);
    }
}

