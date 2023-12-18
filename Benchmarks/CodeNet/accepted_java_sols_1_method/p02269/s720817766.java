import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Set<String> dic = new HashSet<>();
    for(int i = 0; i < n; i++) {
      if(sc.next().equals("insert")) {
        dic.add(sc.next());
      } else {
        if(dic.contains(sc.next())) {
          System.out.println("yes");
        } else {
          System.out.println("no");
        }
      }
    }
  }
}

