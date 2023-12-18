import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<String> list = new ArrayList<String>();
    for(int i = 0; i < n; i++) {
      list.add(sc.next());
    }

    Collections.sort(list);

    System.out.println(list.get(0));
  }
}