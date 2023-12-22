import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int removals = 0;

    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (stack.empty() || stack.peek() == c)
        stack.push(c);
      else {
        stack.pop();
        removals += 2;
      }
    }

    System.out.println(removals);
  }
}