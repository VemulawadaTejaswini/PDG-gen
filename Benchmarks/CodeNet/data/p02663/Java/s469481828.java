import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H1 = Integer.parseInt(sc.next());
        int M1 = Integer.parseInt(sc.next());
        int H2 = Integer.parseInt(sc.next());
        int M2 = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        int m = 0;
        int h = (H1<=H2)? H2-H1 : (24-H2) + H1;

        if (M1 < M2) {
            m = M2 - M1;
            m += (h-1) * 60;
        } else {
            m = M1 - M2;
            m += h * 60;
        }
        m -= K;
        System.out.println(m);
    }
}