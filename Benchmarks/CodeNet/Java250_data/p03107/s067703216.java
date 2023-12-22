import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Stack<Character> stack = new Stack<>();
    char[] s = scanner.next().toCharArray();
    int N = s.length;
    for (char c : s) {
      if (!stack.isEmpty() && stack.peek() != c) stack.pop();
      else stack.add(c);
    }
    System.out.println(N - stack.size());
  }
}
