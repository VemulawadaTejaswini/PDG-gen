import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < N; i++) {
            int D = sc.nextInt();
            s1 += D;
            s2 += D * D;
        }
        System.out.println((s1 * s1 - s2) / 2);
    }

}
