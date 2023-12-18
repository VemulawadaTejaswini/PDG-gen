
import java.util.Scanner;

public class Main {

    public int countMultiple(int l, int r, int d) {
        int ans = (r / d) - (l / d);
        return l % d == 0 ? ans + 1 : ans;
    }

    public static void main(String args[]) {
        Main nm = new Main();
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(nm.countMultiple(l, r, d));
    }
}
