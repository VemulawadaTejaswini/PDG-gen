import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int cnt = 0;
        sc.close();
        while (C != 0 && B >= A) {
            B = B - A;
            --C;
            cnt++;
        }
        System.out.println(cnt);

    }
}