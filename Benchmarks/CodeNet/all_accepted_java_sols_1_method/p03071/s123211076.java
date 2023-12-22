import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b =sc.nextInt();
        int ans = Math.max(a+b, Math.max(a*2-1, b*2-1));
        System.out.println(ans);
    }
}
