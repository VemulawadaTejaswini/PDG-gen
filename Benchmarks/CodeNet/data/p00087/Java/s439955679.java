import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out ="";
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String[] p = line.split(" ");
      Deque<String> stack = new ArrayDeque<String>();
      for (int ii = 0; ii < p.length; ii++) {
        stack.addLast(p[ii]);
      }
      Deque<Double> work = new ArrayDeque<Double>();
      for (;;) {
        if (stack.isEmpty()) {
          out += work.pop() + "\n";
          break;
        }
        String pp = stack.pop();
        if (!isNumber(pp)) {
          double a = work.pop();
          double b = work.pop();
          double c = 0;
          if (pp.equals("+")) {
            c = b + a;
          } else if (pp.equals("-")) {
            c = b - a;
          } else if (pp.equals("*")) {
            c = b * a;
          } else if (pp.equals("/")) {
            c = b / a;
          }
          work.push(c);
        } else {
          work.push(Double.parseDouble(pp));
        }
      }
    }
    System.out.print(out);
  }

  private static boolean isNumber (String str) {
    try {
      Double.parseDouble(str);
      return true;
    } catch (NumberFormatException nfex) {
      return false;
    }
  }
}