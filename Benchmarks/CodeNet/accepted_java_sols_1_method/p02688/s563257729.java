import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int allSunuke = sc.nextInt();
    int snackKind = sc.nextInt();

    int[] list = new int[allSunuke];
    for (int i = 0; i < snackKind; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++) {
        int sunukeNumber = sc.nextInt();
        list[sunukeNumber - 1]++;
      }
    }

    int count = 0;

    for (int i = 0; i < list.length; i++) {
      if (list[i] == 0) {
        count++;
      }
    }

    System.out.println(count);

    sc.close();
  }
}