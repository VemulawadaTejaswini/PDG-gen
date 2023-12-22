import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int days = sc.nextInt();
    int works = sc.nextInt();

    int[] workList = new int[works];

    for (int i = 0; i < works; i++) {
      workList[i] = sc.nextInt();
    }

    for (int i = 0; i < workList.length; i++) {
      days -= workList[i];
    }

    if (days < 0) {
      System.out.println("-1");
    } else {
      System.out.println(days);
    }

    sc.close();

  }

}