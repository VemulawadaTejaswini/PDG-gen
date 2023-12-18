
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[N];

        for (int j = 0; j < Q; j++) {
            A[sc.nextInt() - 1] += 1;

        }

        for (int point : A) {
            System.out.println(K - (Q - point) > 0 ? "Yes" : "No");
        }

    }
}


