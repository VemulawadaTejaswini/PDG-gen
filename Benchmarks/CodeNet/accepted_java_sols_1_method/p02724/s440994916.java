import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = n / 500 * 1000;
        n %= 500;
        res += n / 5 * 5;
        System.out.println(res);
    }
}
