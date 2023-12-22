import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();
    int[] hights = new int[count];

    for (int i = 0; i < count ; i++ ) {
      hights[i] = sc.nextInt();
    }

    int highest = hights[0];

    int result = 0;

    for (int i = 0; i < count ; i++ ) {
      if (hights[i] >= highest) {
        result++;
        highest = hights[i];
      }
    }

    System.out.println(result);
  }
}
