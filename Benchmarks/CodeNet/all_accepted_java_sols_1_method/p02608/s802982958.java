import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] res = new int[N + 1];

        for (int x = 1; x < 100; x++) {
            for (int y = 1; y < 100; y++) {
                for (int z = 1; z < 100; z++) {
                    int ans = (x * x) + (y * y) + (z * z) + (x * y) + (y * z) + (z * x);
                    if (ans <= N) {
                        res[ans]++;
                    }
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(res[i]);
        }
    }
}