import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        final int kuji_num = s.nextInt();
        final Set<String> itemSet = new HashSet<String>();
        for (int i = 0 ; i <= kuji_num ; i++) {
            itemSet.add(s.nextLine());
        }
        System.out.println(itemSet.size() - 1);
  }
}