import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Set<Integer> set = new HashSet<>();
    set.add(sc.nextInt());
    set.add(sc.nextInt());
    set.add(sc.nextInt());

    if(set.size() == 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
