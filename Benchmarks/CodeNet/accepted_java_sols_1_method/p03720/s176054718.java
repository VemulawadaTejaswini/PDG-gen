import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] city = new int[N];
        for (int i = 0; i < M; ++i) {
            int A = sc.nextInt();
            ++city[A - 1];
            int B = sc.nextInt();
            ++city[B - 1];
        }
        sc.close();
        for (int i = 0; i < N; ++i) {
            System.out.println(city[i]);
        }
    }
}