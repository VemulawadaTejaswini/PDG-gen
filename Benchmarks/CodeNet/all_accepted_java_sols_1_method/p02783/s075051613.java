import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int a = sc.nextInt();

        double dh = (double)h;
        double da = (double)a;

        double ans = Math.ceil(dh / da);

        int ians = (int)ans;

        System.out.println(ians);

    }
}