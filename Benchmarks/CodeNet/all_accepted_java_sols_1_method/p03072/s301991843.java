import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    List<Integer> list = new LinkedList<>();
    for (int i = 0; i < N; i++) {
      list.add(scan.nextInt());
    }
    int maxHeight = 0;
    int count = 0;
    for (int h : list) {
      if (h >= maxHeight) {
        count++;
        maxHeight = h;
      }
    }

    System.out.println(count);
  }
}
