
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    long[] hp = new long[n];

    for (int i=0;i<n;i++) {
      hp[i] = cin.nextLong();
    }

    Arrays.sort(hp);

    if (hp[0] == 1) {
      System.out.println(1);
      return;
    }
    else {
      long flag = hp[0];
      int start = 0;
//      System.out.println(flag);
      while (true) {

        for (int i=start+1;i<n;i++) {
          hp[i] = hp[i]%flag;
        }
        Arrays.sort(hp);
//        System.out.println(Arrays.toString(hp));
        int zeroCount = 0;
        while (hp[zeroCount]==0) {
          zeroCount++;
        }
        if (zeroCount==n-1) {
          System.out.println(hp[n-1]);
          return;
        }
        else {
          flag = hp[zeroCount];
          start = zeroCount;
          if (flag==1) {
            System.out.println(flag);
            return;
          }
        }

      }
    }

  }

}
