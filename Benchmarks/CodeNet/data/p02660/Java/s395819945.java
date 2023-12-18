import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        ArrayDeque<Integer> z = new ArrayDeque<Integer>();
        z.add(1);

        int count = 0;

        while (N != 1) {
            for (int i = z.getLast() + 1; i <= N; i++) {
                if (N % i == 0) {
                    int count_l = 1;
                    while (N % Math.pow(i, count_l) == 0) {
                        count++;
                        z.add(i);
                        N /= Math.pow(i, count_l);
                        count_l++;
                    }
                    break;
                }
            }
        }
        System.out.println(count);
    }
}