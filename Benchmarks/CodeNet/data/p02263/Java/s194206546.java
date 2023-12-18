import java.util.*;

public class Main {
    public static void main(String[] args) {
        aldl_1_3_a();
    }

    static void aldl_1_3_a() {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        sc.close();

        ArrayList<Integer> stack = new ArrayList<Integer>();

        for (int i = 0; i < data.length; i++) {
            String value = data[i];
            int first, second;

            switch (value) {
                case "+":
                    first = stack.get(stack.size() - 2);
                    second = stack.get(stack.size() - 1);
                    int a = first + second;
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    stack.add(a);
                    break;
                case "-":
                    first = stack.get(stack.size() - 2);
                    second = stack.get(stack.size() - 1);
                    int b = first - second;
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    stack.add(b);
                    break;
                case "*":
                    first = stack.get(stack.size() - 2);
                    second = stack.get(stack.size() - 1);
                    int c = first * second;
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    stack.add(c);
                    break;
                default:
                    stack.add(Integer.parseInt(value));
                    break;
            }
        }
        System.out.println(stack.get(0));
    }
}
