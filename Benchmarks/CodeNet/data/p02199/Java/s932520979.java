import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        double r = sc.nextInt();
        int dis = b * p - (b - a) * q;
        System.out.println(dis / (q + r) + b);
    }
}

