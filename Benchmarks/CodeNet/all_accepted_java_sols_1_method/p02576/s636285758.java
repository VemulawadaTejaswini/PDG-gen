import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();

        int res = (n + (x-1)) / x * t;
        System.out.println(res);
    }

}