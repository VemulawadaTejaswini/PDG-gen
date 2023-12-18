import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static long res = 0;
    public static int[] ary;
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println(stack.pop());
            } else {
                stack.push(n);
            }
        }
    }
}