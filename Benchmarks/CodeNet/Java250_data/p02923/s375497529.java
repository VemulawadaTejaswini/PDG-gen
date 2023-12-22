import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
        }

        int count = 0;
        int tmpCount = 0;
        for (int i = 0; i < N - 1; i++) {
            if (H[i] >= H[i + 1]) {
                tmpCount++;
                if (i == N - 2 && tmpCount > count) {
                    count = tmpCount;
                }
            } else {
                if (tmpCount > count) {
                    count = tmpCount;
                }
                tmpCount = 0;
            }
        }
        System.out.println(count);
    }
}