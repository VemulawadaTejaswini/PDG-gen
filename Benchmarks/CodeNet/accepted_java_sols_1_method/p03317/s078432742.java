import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int c = 1;


        for (int i = K; i < N; i += K - 1) {
            c++;
        }

        System.out.println(c);
    }
}
