import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();

        int pow = 1;
        for (int i = 0; i < M; i++) {
            pow *= 2;
        }
        System.out.println((1900 * M + 100 * (N - M)) * pow);
    }
}