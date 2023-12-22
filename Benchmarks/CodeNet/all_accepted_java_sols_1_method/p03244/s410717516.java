import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    final int MAX_V = 100000;
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int n = in.nextInt();
      int halfN = n / 2;
      int[] v = new int[n];
      int[] countOdd = new int [MAX_V + 1];
      int[] countEven = new int [MAX_V + 1];

      for (int i = 0; i < v.length; ++i) {
        v[i] = in.nextInt();

        if (i % 2 == 0) {
          ++countEven[v[i]];
        } else {
          ++countOdd[v[i]];
        }
      }
      
      int evenMax1 = -1;
      int evenMax1Count = 0;
      for (int i = 0; i < countEven.length; ++i) {
        if (countEven[i] > evenMax1Count) {
          evenMax1 = i;
          evenMax1Count = countEven[i];
        }
      }

      countEven[evenMax1] = 0;
      int evenMax2Count = 0;
      for (int i = 0; i < countEven.length; ++i) {
        if (countEven[i] > evenMax2Count) {
          evenMax2Count = countEven[i];
        }
      }

      int oddMax1 = -1;
      int oddMax1Count = 0;
      for (int i = 0; i < countOdd.length; ++i) {
        if (countOdd[i] > oddMax1Count) {
          oddMax1 = i;
          oddMax1Count = countOdd[i];
        }
      }

      countOdd[oddMax1] = 0;
      int oddMax2Count = 0;
      for (int i = 0; i < countOdd.length; ++i) {
        if (countOdd[i] > oddMax2Count) {
          oddMax2Count = countOdd[i];
        }
      }

      if (evenMax1 != oddMax1) {
        System.out.println(halfN - evenMax1Count + halfN - oddMax1Count);
      } else {
        int min = Math.min(halfN - evenMax1Count + halfN - oddMax2Count, halfN - evenMax2Count + halfN - oddMax1Count);
        System.out.println(min);
      }
    }
  }
}