import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] cnt = new int[100005];
        for (int i = 0; i < N; i++) {
            cnt[sc.nextInt()]++;
        }

        long sum = 0;
        for (int j = 0; j < 100005; j++) {
            sum += j * cnt[j];
        }

        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int before = sc.nextInt();
            int after = sc.nextInt();
            cnt[after] += cnt[before];
            sum += after * cnt[before] - before * cnt[before];
            cnt[before] = 0;
            System.out.println(sum);
        }
        sc.close();

    }
}
