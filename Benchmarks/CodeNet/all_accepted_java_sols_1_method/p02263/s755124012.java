import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      Deque<Integer> stack = new ArrayDeque<>();
      int tmpA = 0, tmpB = 0;
      String[] str = sc.nextLine().split("\\s");

      for (String s : str) {
        if (s.equals("+")) {
          tmpA = stack.pop();
          tmpB = stack.pop();
          stack.push(tmpA + tmpB);
        } else if (s.equals("-")) {
          tmpA = stack.pop();
          tmpB = stack.pop();
          stack.push(tmpB - tmpA);
        } else if (s.equals("*")) {
          tmpA = stack.pop();
          tmpB = stack.pop();
          stack.push(tmpA * tmpB);
        } else {
          stack.push(Integer.valueOf(s));
        }
      }

      System.out.println(stack.pop());
    }
  }
}

