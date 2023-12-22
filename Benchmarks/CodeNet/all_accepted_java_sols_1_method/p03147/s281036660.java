import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] high = new int[N+1];
        for (int i = 1; i <= N; i++) {
            high[i] = sc.nextInt();
        }
        int tot = 0;
        int tmp = 0;
        for (int i = 1; i < N+1; i++) {
            if (tmp < high[i]) {
                tot += high[i]-tmp;
            }
            tmp = high[i];
        }
        System.out.println(tot);
    }
}