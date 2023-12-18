import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int ans = Math.max(10 * a + b + c, Math.max(a + 10 * b + c, a + b + 10 * c));
        System.out.println(ans);
    }
}