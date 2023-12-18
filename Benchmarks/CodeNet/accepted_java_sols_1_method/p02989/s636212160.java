import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++)
	  list.add(sc.nextInt());
    Collections.sort(list);
    System.out.println(list.get(list.size() / 2) - list.get(list.size() / 2 - 1));
  }
}