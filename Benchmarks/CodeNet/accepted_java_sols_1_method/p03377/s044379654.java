import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        System.out.println( ( X - A >= 0 && B > X - A) ? "YES" : "NO" );
    }
}
