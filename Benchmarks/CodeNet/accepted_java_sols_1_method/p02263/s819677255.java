import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        while (sc.hasNext()) {
            String s = sc.next();
            if ('0' <= s.charAt(0) && s.charAt(0) <= '9') {
                st.push(Integer.parseInt(s));
            } else {
                int b = st.pop(), a = st.pop();
                if ("+".equals(s)) {
                    st.push(a + b);
                } else if ("-".equals(s)) {
                    st.push(a - b);
                } else if ("*".equals(s)) {
                    st.push(a * b);
                }
            }
        }
        System.out.println(st.pop());
    }

}
