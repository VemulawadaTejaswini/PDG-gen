import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] l1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] l2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] l3 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < n; i++) {
      int t = Integer.parseInt(sc.nextLine());
      for (int j = 0; j < 3; j++) {
        if (l1[j] == t) {
          l1[j] = 0;
        }
        if (l2[j] == t) {
          l2[j] = 0;
        }
        if (l3[j] == t) {
          l3[j] = 0;
        }
      }
    }
    if (l1[0] == l2[0] && l2[0] == l3[0]) {
      System.out.println("Yes");
    } else if (l1[1] == l2[1] && l2[1] == l3[1]) {
      System.out.println("Yes");
    } else if (l1[2] == l2[2] && l2[2] == l3[2]) {
      System.out.println("Yes");
    } else if (l1[0] == l1[1] && l1[1] == l1[2]) {
      System.out.println("Yes");
    } else if (l2[0] == l2[1] && l2[1] == l2[2]) {
      System.out.println("Yes");
    } else if (l3[0] == l3[1] && l3[1] == l3[2]) {
      System.out.println("Yes");
    } else if (l1[0] == l2[1] && l2[1] == l3[2]) {
      System.out.println("Yes");
    } else if (l1[2] == l2[1] && l2[1] == l3[0]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    sc.close();
  }
}
