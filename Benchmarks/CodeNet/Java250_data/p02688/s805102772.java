import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    List<Integer> sunukes = new ArrayList<>();
    int[] treat = new int[n];

    int count = 0;

    for (int i = 0; i < k; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++) {
        sunukes.add(sc.nextInt());
      }
    }
    for (int sunuke : sunukes) {
      treat[sunuke - 1] = 1;
    }

    for (int num : treat) {
      if (num == 0) {
        count++;
      }
    }  

    System.out.println(count);

  }
}
