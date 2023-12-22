import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0; i < N; i++) {
      list.add(sc.next());
    }
    Collections.sort(list);
    StringBuilder A = new StringBuilder();
    for (int i = 0; i < N; i++) {
      A.append(list.get(i));
    }
    System.out.println(A);
  }
}
