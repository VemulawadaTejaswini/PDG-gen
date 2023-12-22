import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            Stack<Integer> st = new Stack<Integer>();

            for (int i = 0; i < s.length(); i++) {
                char at = s.charAt(i);
                if ('B' == at) {
                    if(!st.empty()) st.pop();
                } else {
                    st.push(Character.getNumericValue(at));
                }
            }

            Object[] a = st.toArray();

            for (int i = 0; i < a.length; i++)
                System.out.print(a[i].toString());

            System.out.println();
        }
    }
}
