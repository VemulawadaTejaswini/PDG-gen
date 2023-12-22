import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();

        for (int i = 0; i < 100000000; i++) {
            if ((2 * D + 1) * i >= N) {
                System.out.println(i);
                return;
            }
        }
    }
}
