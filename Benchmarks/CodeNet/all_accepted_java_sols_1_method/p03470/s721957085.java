import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int N = in.nextInt();
      int d[] = new int[N+1];

      int moti = 0;

          for(int cnt = 0; cnt < N; cnt++) {
              d[cnt] = in.nextInt();
          }

          Arrays.sort(d);

          for(int cnt = 0; cnt < N; cnt++) {

              if(d[cnt] < d[cnt+1]) {
                  moti++;
              }
          }



      System.out.println(moti);
  }


}
