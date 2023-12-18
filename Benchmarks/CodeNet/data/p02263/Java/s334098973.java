import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int Max = 1000;
  static int top;
  static int[] Stack = new int[Max];

  public static void main(final String[] args) {
    initialize();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] str = s.split(" ");
    for (int i = 0; i < str.length; i++) {
      if (Character.isDigit(str[i].charAt(0))) {
        push(Integer.parseInt(str[i]));
      }
      else if (String.valueOf(str[i]).equals("+")) {
        int a = pop();
        int b = pop();
        push(a + b);
      }
      else if (String.valueOf(str[i]).equals("-")) {
        int a = pop();
        int b = pop();
        push(b - a);
      }
      else if (String.valueOf(str[i]).equals("*")) {
        int a = pop();
        int b = pop();
        push(a * b);
      }
    }
    System.out.println(pop());
  }

  private static void initialize() {
    top = 0;
  }

  private static boolean isEmpty() {
    return top == 0;
  }

  private static boolean isFull() {
    return top >= Max - 1;
  }

  private static void push(int x) {
    if (isFull()) {
      throw new Error("Over Flow");
    }
    top++;
    Stack[top] = x;
  }

  private static int pop() {
    if (isEmpty()) {
      throw new Error("Under Flow");
    }
    top--;
    return Stack[top + 1];
  }

  private static void print(int[] A) {
    System.out.println(Arrays.toString(A));
  }
}
