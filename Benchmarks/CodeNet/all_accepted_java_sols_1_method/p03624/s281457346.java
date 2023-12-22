import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    char[] arr = sc.next().toCharArray();
    Set<Character> set = new TreeSet<>();
    for (char c : arr) {
      set.add(c);
    }

    for (int i = (int) 'a'; i <= (int) 'z'; i++) {
      if (!set.contains((char) i)) {
        System.out.println((char) i);
        return;
      }
    }
    System.out.println("None");
  }
}
