import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int L = Integer.parseInt(sc.next());
        double edge = L / 3.0;
        double ans = edge * edge * edge;
        System.out.println(String.format("%.12f", ans));
    }
}