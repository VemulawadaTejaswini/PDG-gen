import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += Integer.parseInt(String.valueOf(c[i]));
        }
        if (Integer.parseInt(str) % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
