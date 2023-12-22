import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> train = new Stack<>();
        while (sc.hasNext()) {
            int num = Integer.parseInt(sc.next());

            if (num == 0) {
                System.out.println(train.pop());
            } else {
                train.push(num);
            }
        }
    }
}