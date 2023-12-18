import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Long> res = new ArrayList<>();
        long depth = 0;
        int last = 0;
        long tmp = 0;
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '/') {
                if (depth > 0) {
                    depth--;
                }
                tmp += depth;
                if (depth == 0 && tmp != 0) {
                    last = i;
                    sum += tmp;
                    res.add(tmp);
                    tmp = 0;
                }
            } else if (c == '_') {
                tmp += depth;
            } else { // '\'
                depth++;
                tmp += depth;
            }
        }
        depth = 0;
        tmp = 0;
        Stack<Long> stack = new Stack<>();
        for (int i = s.length() - 1; i > last; i--) {
            char c = s.charAt(i);
            if (c == '/') {
                depth++;
                tmp += depth;
            } else if (c == '_') {
                tmp += depth;
            } else { // '\'
                if (depth > 0) {
                    depth--;
                }
                tmp += depth;
                if (depth == 0 && tmp != 0) {
                    sum += tmp;
                    stack.push(tmp);
                    tmp = 0;
                }
            }
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        System.out.println(sum);
        System.out.print(res.size());
        printList(res);
    }

    private static <T> void printList(List<T> list) {
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(" ");
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}