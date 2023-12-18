import java.util.Scanner;

public class Stack {
  static int top = 0;
  static int[] S = new int[101];
  
  static void push(int x) {
    S[++top] = x;
  }

  static int pop() {
    top--;
    return S[top + 1];
  }
  
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    String s;
    int a, b;
    while (stdIn.hasNext()) {
      s = stdIn.next();
      if (s.equals("+")) {
        a = pop();
        b = pop();
        push(a + b);
      } else if (s.equals("-")) {
        b = pop();
        a = pop();
        push(a - b);
      } else if (s.equals("*")) {
        a = pop();
        b = pop();
        push(a * b);
      } else {
        push(Integer.parseInt(s));
      }
    }

    System.out.println(pop());
  }
}  