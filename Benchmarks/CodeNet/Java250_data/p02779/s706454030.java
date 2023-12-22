import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    Set<String> chkList = new LinkedHashSet<>();
    for (int i = 0; i < cnt; i++) {
        chkList.add(sc.next());
    }
    if (chkList.size() == cnt) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
  }
}