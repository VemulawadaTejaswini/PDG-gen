import java.util.*;

public class Main {
  static int top = 0;
  static int max = 110;
  static int[] stack = new int[max];

  public static boolean isNum(String str) {
    try {
      Integer.parseInt(str);
      return true;
    } catch(NumberFormatException e) {
      return false;
    }
  }
  public static void initialize() {
    top = 0;
  }
  public static boolean isEmpty() {
    return top == 0;
  }
  public static boolean isFull() {
    return top >= max - 1;
  }
  public static void push(int x) {
    if(isFull()) {
      throw new IllegalArgumentException("オーバーフロー");
    } else {
      top++;
      stack[top] = x;
    }
  }
  public static int pop() {
    if(isEmpty()) {
      throw new IllegalArgumentException("アンダーフロー");
    } else {
      top--;
      return stack[top + 1];
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = "";
    int a;
    while(sc.hasNext()) {
      s = sc.next();
      if(isNum(s)) {
        push(Integer.parseInt(s));
      } else if(s.equals("+")) {
        a = pop() + pop();
        push(a);
      } else if(s.equals("-")) {
        a = - (pop() - pop());
        push(a);
      } else {
        a = pop() * pop();
        push(a);
      }
    }
    System.out.println(pop());
  }
}

