import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H[] = new int[N];
        int answer = 1;
        int max = 0;

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                max = H[i];
            } else {
                if (max <= H[i]) {
                    max = H[i];
                    answer++;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}