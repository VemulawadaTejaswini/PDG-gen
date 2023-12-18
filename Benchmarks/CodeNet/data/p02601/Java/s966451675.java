import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int aR = sc.nextInt();
    int bG = sc.nextInt();
    int cB = sc.nextInt();
    int k = sc.nextInt();

    for (int i = 0; i < k; i++) {
      if (aR > bG) {
        bG = bG * 2;
        continue;
      }
      if (bG > cB) {
        cB = cB * 2;
        continue;
      }
      break;
    }

    System.out.println(cB > bG && bG > aR ? "Yes" : "No");
  }
}