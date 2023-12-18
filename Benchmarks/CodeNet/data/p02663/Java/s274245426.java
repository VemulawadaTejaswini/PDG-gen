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
        if (M1 < M2) {
            m = M2 - M1;
            m += (H2 - H1-1) * 60;
        } else {
            m = M1 - M2;
            m += (H2 - H1) * 60;
        }
        m -= K;
        System.out.println(m);
    }
}