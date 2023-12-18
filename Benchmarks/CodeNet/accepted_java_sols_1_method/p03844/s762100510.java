import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        int ans = 0;
        if(op.equals("+")) {
            ans = a + b;
        } else if (op.equals("-")) {
            ans = a - b;
        }
        System.out.println(ans);
    }
}
