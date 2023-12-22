import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String u = sc.next();
        if (u.equals(s)) {
            System.out.println(--a + " " + b);
        } else {
            System.out.println(a + " " + --b);
        }
    }
}
