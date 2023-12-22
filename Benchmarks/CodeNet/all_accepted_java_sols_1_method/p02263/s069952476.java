import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] strs = sc.nextLine().split(" ");

    Deque<String> stack = new ArrayDeque<>();

    long a = 0;
    long b = 0;
  
    for (String s : strs) {
      if (Arrays.asList("+", "-", "*").contains(s)) {
        a = Long.valueOf(stack.pop());
        b = Long.valueOf(stack.pop());
      }

      String r = s;
      if ("+".equals(s)) r = String.valueOf(b + a);
      if ("-".equals(s)) r = String.valueOf(b - a);
      if ("*".equals(s)) r = String.valueOf(b * a);

      stack.push(r);
    }

    System.out.println(stack.pop());
  }
}
