import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String u = sc.next();
        System.out.println(s1.equals(u) ? (a-1) + " " + b : a + " " + (b-1));
    }
}