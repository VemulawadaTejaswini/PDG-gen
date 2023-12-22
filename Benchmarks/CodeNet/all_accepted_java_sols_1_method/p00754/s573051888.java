import java.util.*;

/**
 * TheBalanceoftheWorld
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            String str = sc.nextLine();

            if (str.equals("."))
                break;
            char array[] = str.toCharArray();

            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < array.length; i++) {
                switch (array[i]) {
                case '(':
                    stack.add('(');
                    break;
                case ')':
                    try {
                        if (stack.pop() != '(') {
                            System.out.println("no");
                            continue loop;
                        }
                    } catch (Exception e) {
                        System.out.println("no");
                        continue loop;
                    }
                    break;
                case '[':
                    stack.add('[');
                    break;
                case ']':
                    try {
                        if (stack.pop() != '[') {
                            System.out.println("no");
                            continue loop;
                        }
                    } catch (Exception e) {
                        System.out.println("no");
                        continue loop;
                    }

                    break;
                }
            }

            if (stack.empty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
