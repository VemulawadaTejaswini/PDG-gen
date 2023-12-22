import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int ap = 0;
    int bp = 0;
    for (int i = 0; i < n; i++) {
        int result = sc.next().compareTo(sc.next());
        ap += result > 0 ? 3 : result < 0 ? 0 : 1;
        bp += result > 0 ? 0 : result < 0 ? 3 : 1;
    }

    System.out.println(ap + " " + bp);
  }
}
