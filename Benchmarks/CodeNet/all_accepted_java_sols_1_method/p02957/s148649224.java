import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        if (c % 2 != 0) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(c / 2);
        }
    }
}
