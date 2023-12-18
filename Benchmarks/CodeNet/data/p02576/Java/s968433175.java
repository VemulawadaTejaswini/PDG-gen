import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int t = scan.nextInt();
        int ans = (n + x - 1) / x * t;
        System.out.println(ans);
    }
}
