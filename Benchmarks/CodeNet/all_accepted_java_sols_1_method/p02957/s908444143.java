import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = Math.abs(a+b);
        System.out.println(ans % 2 == 0? ans/2: "IMPOSSIBLE");
    }
}