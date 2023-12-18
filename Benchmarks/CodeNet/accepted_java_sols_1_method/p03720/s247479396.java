
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int cntCity = sc.nextInt();
    int cntRoad = sc.nextInt();
    int[] city = new int[cntCity];

    for (int i = 0; i < cntRoad; i++) {
      city[sc.nextInt() - 1] += 1;
      city[sc.nextInt() - 1] += 1;
    }

    for (int i : city) {
      System.out.println(i);
    }
  }
}
