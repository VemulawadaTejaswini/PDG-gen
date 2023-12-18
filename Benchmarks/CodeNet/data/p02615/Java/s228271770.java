import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String N_scan = scan.nextLine();
    String A_scan = scan.nextLine();
    int ans = 0;
    var N = Integer.parseInt(N_scan);

    var A = A_scan.split(" ");

    var list = new ArrayList<Integer>();

    for (var i = 0;i < N; i++) {
      list.add(Integer.parseInt(A[i]));
    }

    Collections.sort(list, Collections.reverseOrder());

    for (var j = 0; j < N-1; j++) {
      ans = ans + list.get(j);
    }

    System.out.println(ans);
    scan.close();
  }
}