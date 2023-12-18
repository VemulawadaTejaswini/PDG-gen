import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    // 5 4 3 2 1

    // 5

    // 5 4

    // 5 3 4
    // 5 3 4 2
    // 5 3 1 4 2


    // 5 3 1 4 2

    // 5 2 4 1 3

    int n = sc.nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    sc.close();

    Arrays.sort(a);

    long happy = 0;
    List<Long> maxHappy = new ArrayList<Long>();
    List<Long> list = new ArrayList<Long>();
    for (int i = 0; i < n; i++) {
      long value = a[n - i - 1];
      if (i == 0) {
        list.add(value);

      } else if (i == 1) {
        list.add(value);
        happy += a[n - i ];
        maxHappy.add(value);
      // } else if (i == 2) {
      //   list.add(a[n - i - 1]);
      //   happy += a[n - i];
      } else {

        int j3 = -1;
        while(maxHappy.size() > 0) {
          for (int j = 0; j < i; j++) {
            if (list.get(j) == maxHappy.get(0)) {
              int j2 = j == 0 ? list.size() - 1 : j - 1;
              if (list.get(j) <= list.get(j2)) {
                j3 = j;
                break;
              }
              j2 = j == (list.size() - 1) ? 0 : j + 1;
              if (list.get(j) <= list.get(j2)) {
                j3 = j;
                break;
              }
            }
          }
          if (j3 >= 0) {
            happy += maxHappy.get(0);
            list.add(j3, value);
            break;
          }
          maxHappy.remove(0);
        }

        maxHappy.add(value);
      }
    }


    System.out.println(happy);
  }
}
