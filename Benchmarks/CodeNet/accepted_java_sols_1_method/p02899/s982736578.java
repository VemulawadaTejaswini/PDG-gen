import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] order = new int[n];

    for (int i = 0; i < n; i++) {
      int student = sc.nextInt();
      order[student - 1] = i + 1;
    }

    for (int j = 0; j < order.length; j++) {
      System.out.print(order[j] + " ");
    }
  }
}
