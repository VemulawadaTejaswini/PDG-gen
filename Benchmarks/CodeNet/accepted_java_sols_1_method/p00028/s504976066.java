import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out ="";
    int[] a = new int[100];
    int maxValue = -1;
    int[]maxNum = new int[100];
    int maxCnt = 0;
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      a[n - 1]++;
    }
    for (int ii = 0; ii < 100; ii++) {
      if (a[ii] > maxValue) {
        maxValue = a[ii];
        maxNum[maxCnt] = ii + 1;
        continue;
      }
      if (a[ii] == maxValue) {
        maxCnt++;
        maxNum[maxCnt] = ii + 1;
        continue;
      }
    }
    for (int ii = 0; ii < 100; ii++) {
      if (maxNum[ii] == 0) {
          break;
      }
      out += maxNum[ii] + "\n";
    }
    System.out.print(out);
  }
}