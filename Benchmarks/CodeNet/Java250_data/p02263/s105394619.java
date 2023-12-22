import java.util.Scanner;
import java.util.Stack;

public class Main {

  char[] c;
  int id;

  int number() {
    int ret = 0;
    while (id < c.length && c[id] != ' ') {
      ret *= 10;
      ret += c[id] - '0';
      id++;
    }
    id++;
    return ret;
  }

  int operand() {
    int ret = c[id];
    id += 2;
    return ret;
  }

  int calc(int s, int t, int op) {
    if (op == '+') {
      return s + t;
    }
    if (op == '-') {
      return s - t;
    }
    if (op == '*') {
      return s * t;
    }
    return 999;
  }

  void run() {
    Scanner sc = new Scanner(System.in);

    c = sc.nextLine().toCharArray();
    id = 0;

    Stack<Integer> stack = new Stack<Integer>();
    while (id < c.length) {
      if ('0' <= c[id] && c[id] <= '9') {
        int k = number();
        stack.push(k);
      } else {
        int op = operand();
        int s = stack.pop();
        int t = stack.pop();
        int u = calc(t, s, op);
        stack.push(u);
      }
    }
    System.out.println(stack.peek());
  }

  public static void main(String[] args) {
    new Main().run();
  }
}