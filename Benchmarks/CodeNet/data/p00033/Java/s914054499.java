import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        for (int i = 0;i < n;i++) {
            Stack<Integer> s1 = new Stack<>();
            Stack<Integer> s2 = new Stack<>();
            if (solve(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean solve(Stack s1, Stack s2) {
        for (int i = 0;i < 10;i++) {
            int val = sc.nextInt();
            if (i == 0) {
                s1.push(val);
            } else {
                int val1 = get(s1);
                int val2 = get(s2);
                if (val1 > val && val2 > val) {
                    return false;
                } else if (val1 > val2 && val1 < val) {
                    s1.push(val);
                } else {
                    s2.push(val);
                }
            }
        }
        return true;
    }
    
    public static int get(Stack s) {
        int ret;
        if (s.empty()) {
            ret = 0;
        } else {
            ret = (Integer) s.peek();
        }
        return ret;
    }
}