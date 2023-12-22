import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();

    sc.close();

    boolean valid = true;

    Set<Integer> hashSet = new HashSet<Integer>();

    hashSet.add(s);

    int count = 2;

    while (valid) {

      if (s % 2 == 0) {
        s = s / 2;
      } else {
        s = 3 * s + 1;
      }

      if (hashSet.contains(s)) {
        valid = false;
      } else {
        hashSet.add(s);
        count++;
      }

    }

    System.out.println(count);

  }

}