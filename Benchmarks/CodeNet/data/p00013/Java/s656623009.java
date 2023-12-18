import java.util.Scanner;
import java.util.Stack;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> cars = new Stack<Integer>();

    while (sc.hasNext()) {
      int carNum = sc.nextInt();

      if (carNum == 0) {
        System.out.println(cars.pop());
      } else {
        cars.push(carNum);
      }
    }
  }
}