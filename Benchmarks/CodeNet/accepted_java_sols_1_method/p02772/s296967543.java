import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    boolean b = false;

    for (int i = 0; i < N; i++) {
      int A = sc.nextInt();
      if (A % 2 == 0) {
        if ((A % 3 != 0) && (A % 5 != 0)) {
          b = true;
          break;
        }
      }
    }

    if (!b) {
      System.out.println("APPROVED");
    } else {
      System.out.println("DENIED");
    }


    sc.close();
  }
}