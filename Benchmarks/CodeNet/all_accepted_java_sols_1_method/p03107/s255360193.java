import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char[] cubes = s.toCharArray();
        int[] colors = new int[n];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            colors[i] = Character.getNumericValue(cubes[i]);
        }

        for (int c : colors) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (stack.peek() != c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        System.out.println(n - stack.size());
    }
}
