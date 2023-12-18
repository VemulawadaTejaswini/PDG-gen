import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    int n = sc.nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    sc.close();

    Arrays.sort(a);

    long happy = 0;
    List<Long> list = new ArrayList<Long>();
    for (int i = 0; i < n; i++) {

      if (i == 0) {
        list.add(a[n - i - 1]);

      } else if (i == 1) {
        list.add(a[n - i - 1]);
        happy += a[n - i ];
      } else if (i == 2) {
        list.add(a[n - i - 1]);
        happy += a[n - i];
      } else {
        long max = 0;
        int maxIndex = 0;
        for (int j = 0; j < i; j++) {
          long value = list.get(j);
          int j2 = j == 0 ? list.size() - 1 : j - 1;
          long value2 = list.get(j2);
          if (value > value2) {
            if (max < value2) {
              max = value2;
              maxIndex = j;
            }
          } else {
            if (max < value) {
              max = value;
              maxIndex = j;
            }
          }
        }
        list.add(maxIndex, a[n - i - 1]);
        happy += max;
      }
    }


    System.out.println(happy);
  }
}
