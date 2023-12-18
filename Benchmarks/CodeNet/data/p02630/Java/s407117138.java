
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[110000];
        long sum = 0;
        for(int i = 0; i < N; i++) {
            long A = sc.nextLong();
            sum += A;
            arr[(int)A]++;
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            long B = sc.nextInt();
            long C = sc.nextInt();

            sum += (C-B) * arr[(int)B];
            arr[(int)C] += arr[(int)B];
            arr[(int)B] = 0;
            System.out.println(sum);
        }
    }
}
