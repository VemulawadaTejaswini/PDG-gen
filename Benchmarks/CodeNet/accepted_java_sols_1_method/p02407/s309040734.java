import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int num = sc.nextInt();

    for(int i = 0; i < num; i++) {
      int number = sc.nextInt();
      list.add(number);
    }
    sc.close();

    for(int j = (list.size() - 1); j >= 0; j--) {
      if(j == 0) {
        System.out.println(list.get(j));
      } else {
        System.out.print(list.get(j) + " ");
      }
    }
  }
}
