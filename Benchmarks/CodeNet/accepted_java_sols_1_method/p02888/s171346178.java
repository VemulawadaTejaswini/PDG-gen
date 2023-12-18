import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer[] sticks = new Integer[N];

        for(int i = 0; i < N; i++) {

            sticks[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        Arrays.sort(sticks);

      int count = 0;

      for(int i = 0; i < N-2; i++) {

          for(int j = i+1; j < N-1; j++) {

              int serch = ~Arrays.binarySearch(sticks, sticks[i] + sticks[j], (x,y)->x.compareTo(y)>=0?1:-1);
              
              count += (serch <= 0) ? 0 : serch -j -1;
          }
      }

      System.out.println(count);

    }
}
