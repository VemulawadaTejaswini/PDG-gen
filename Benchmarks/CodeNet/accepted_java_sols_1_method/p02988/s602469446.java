import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++)
	  list.add(sc.nextInt());
    int count = 0;
    for (int i = 1; i < n - 1; i++)
      if ((list.get(i-1) > list.get(i) && list.get(i) > list.get(i+1)) || list.get(i-1) < list.get(i) && list.get(i) < list.get(i+1))
        count++;
    System.out.print(count);
  }
}