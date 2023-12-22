
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextInt();
        long R = sc.nextInt();

        int min = 2018;
        int mod;

        for (long i = L; i < R; i++) {
            for (long j = i + 1; j <= R; j++) {
                if (min >= (mod = (int) (i * j % 2019))) {
                    min = mod;
                }
                if (min == 0) {
                    break;
                }
            }
            if(min == 0) {
                break;
            }
        }

        System.out.println(min);
    }
}