import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    System.out.println(calc(input.replace(" ", "")));
  }

  public static boolean inputIsOperand(String input) {
    try {
      Integer.parseInt(input);
      return true;

    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static int calc(String input) {
    Deque<Integer> operand = new ArrayDeque<Integer>(100000);
    int operand1, operand2;
    int result = 0;
    char[] charr = input.toCharArray();

    for (char ch : input.toCharArray()) {
      switch (ch) {

        case '+':
          operand1 = operand.removeFirst();
          operand2 = operand.removeFirst();
          operand.offerFirst(operand2 + operand1);
          break;

        case '-':
          operand1 = operand.removeFirst();
          operand2 = operand.removeFirst();
          operand.offerFirst(operand2 - operand1);
          break;

        case '*':
          operand1 = operand.removeFirst();
          operand2 = operand.removeFirst();
          operand.offerFirst(operand2 * operand1);
          break;

        case '/':
          operand1 = operand.removeFirst();
          operand2 = operand.removeFirst();
          operand.offerFirst(operand2 / operand1);
          break;

        // 数値として処理
        default:
          operand.offerFirst(Character.getNumericValue(ch));
      }
    }

    return operand.removeFirst();
  }
}

