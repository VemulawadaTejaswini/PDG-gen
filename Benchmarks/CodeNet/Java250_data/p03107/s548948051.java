import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int N = S.length;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length; i++) {
            char ch = S[i];
            if (stack.empty()) {
                stack.push(ch);
            } else {
                if (ch == stack.peek()) stack.push(ch);
                else stack.pop();
            }
        }

        int cnt = N;
        while (!stack.empty()) {
            stack.pop();
            cnt--;
        }

        System.out.println(cnt);

        return;
    }

}
