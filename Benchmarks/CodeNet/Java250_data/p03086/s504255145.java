import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();

    List<Character> lst = Arrays.asList('A', 'C', 'G', 'T');
    int max = 0;
    int seq = 0;
    for (int i = 0; i < s.length(); i++) {
      if (lst.contains(s.charAt(i))) {
        ++seq;
      } else {
        if (seq > max) {
          max = seq;
        }
        seq = 0;
      }
    }
    if (seq > max) {
      max = seq;
    }

    System.out.println(max);
  }
}
