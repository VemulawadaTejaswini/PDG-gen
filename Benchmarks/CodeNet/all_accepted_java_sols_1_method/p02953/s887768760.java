import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] H = new int[N];

        for (int i = 0; i < N; i++) H[i] = sc.nextInt();

        boolean isControllable = true;

        for (int i = N - 1; i > 0; i--) {
            if (H[i - 1] - 1 > H[i]) {
                isControllable = false;
                break;
            } else if (H[i - 1] > H[i]) {
                H[i - 1]--;
            }
        }

        System.out.println(isControllable ? "Yes" : "No");
    }
}