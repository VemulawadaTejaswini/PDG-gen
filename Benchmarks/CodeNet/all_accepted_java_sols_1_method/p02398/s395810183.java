import java.util.*;

public class Main {
  static int count = 0;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < 3; i++) {
      list.add(sc.nextInt());
    }
    sc.close();

    for(int i = list.get(0); i <= list.get(1); i++) {
      if(list.get(2) % i == 0) {
        count++;
      }
    }
    System.out.println(count);

  }
}
