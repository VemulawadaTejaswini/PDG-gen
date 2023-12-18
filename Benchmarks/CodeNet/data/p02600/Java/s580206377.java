import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rate;
    int rank = 0;
    int[] boarder = { 600, 800, 1000, 1200, 1400, 1600, 1800 };
    rate = sc.nextInt();
    for (int q = 0; q < 8; q++) {
      if (rate < boarder[q]) {
        rank = 8 - q;
        break;
      }
    }
    System.out.println(rank + "");
    sc.close();
  }
}