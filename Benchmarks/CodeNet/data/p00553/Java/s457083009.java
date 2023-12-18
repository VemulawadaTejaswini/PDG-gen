import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int ret = 0;
        if (a < 0) {
            ret += a * (-1) * c;
            ret += d;
            ret += b * e;
        } else {
            ret += (b-a) * d;
        }
        System.out.println(ret);
    }
}

