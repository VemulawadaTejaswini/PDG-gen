import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> x = new ArrayList<Integer>();
    x.add(sc.nextInt());
    int count = 0;
    while(x.get(count) != 0) {
      System.out.println("Case " + (count + 1) + ": " + x.get(count++));
      x.add(sc.nextInt());
    }
  }
}