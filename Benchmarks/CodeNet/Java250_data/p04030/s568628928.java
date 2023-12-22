

import java.util.Scanner;
import java.util.Stack;


public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        char[] s = sc.next().toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if (s[i] != 'B') {
                stack.push(s[i]);
            } else {
                if (stack.size() > 0) {
                    stack.pop();
                }
            }
        }
        String ans = "";
        for (int i = 0; i < stack.size(); i++) {
            ans += stack.get(i);
        }
        System.out.println(ans);
    }

}
