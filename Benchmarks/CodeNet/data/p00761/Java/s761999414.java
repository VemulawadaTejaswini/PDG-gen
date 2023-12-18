import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int a0 = sc.nextInt();
      int l = sc.nextInt();
      if (a0 == 0 && l == 0) return;
      int count = 0;
      int a[] = new int[21];
      a[0] = a0;

      loop: while (true) {
        int a_tmp[] = new int[l];
        int tmp = a[count];
        for (int i = 0; i < l; i++) {
          a_tmp[i] = tmp % 10;
          tmp /= 10;
        }
        Arrays.sort(a_tmp);

        int min = 0;
        for (int i = 0; i < l; i++) {
          min = min * 10 + a_tmp[i];
        }

        int max = 0;
        for (int i = 0; i < l; i++) {
          max = max * 10 + a_tmp[l-1-i];
        }

        int an = max - min;
        a[++count] = an;
        //System.out.println(amax + " " + amin + ", D = " + an);
        for (int i = 0; i < count; i++) {
          if (an == a[i]) {
            System.out.println(i + " " + an + " " + (count - i));
            break loop;
          }
        }
      }
    }
  }
}

