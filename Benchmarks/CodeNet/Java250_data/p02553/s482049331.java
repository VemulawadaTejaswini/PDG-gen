import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int num[] = new int[4];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      num[i] = Integer.parseInt(scanner.next());
    }
    scanner.close();
    long max = (long) num[0] * (long) num[2];
    long tmp = 0;

    if (num[0] > 0 && num[2] > 0) {
      max = (long) num[1] * (long) num[3];
    } else if (num[1] < 0 && num[3] < 0) {
      max = (long) num[0] * (long) num[2];
    } else {
      for (int j = 0; j < 2; j++) {
        for (int k = 2; k < 4; k++) {
          tmp = (long) num[j] * (long) num[k];
          if (max < tmp) {
            max = tmp;
          }
        }
      }
    }
    System.out.println(max);
  }
}