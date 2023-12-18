import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        while (stdin.hasNext()) {
            int i = stdin.nextInt();
            if (i == 0) {
                System.out.println(st.pop());
            } else {
                st.push(i);
            }




        }
    }
}