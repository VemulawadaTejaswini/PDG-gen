import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] times = new int[5];
    times[0] = sc.nextInt();
    times[1] = sc.nextInt();
    times[2] = sc.nextInt();
    times[3] = sc.nextInt();
    times[4] = sc.nextInt();

    int[] rems = new int[5];
    for (int i = 0; i < 5; i++) {
      rems[i] = (times[i]-1) % 10;
    }

    int minRem = rems[0];
    int minMen = 0;
    for (int i = 1; i < 5; i++) {
      if (rems[i] < minRem) {
        minRem = rems[i];
        minMen = i;
      }
    }

    int t = 0;
    for (int i = 0; i < 5; i++) {
      if (i != minMen) {
        if (times[i] % 10 == 0) {
          t += times[i];
        } else {
          t += ((times[i] / 10) + 1) * 10;
        }
      }
    }
    t += times[minMen];

    System.out.println(t);
  }
}
