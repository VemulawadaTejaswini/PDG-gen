import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] abcde = new long[5];
        for (int i = 0; i < 5; i++) {
            abcde[i] = sc.nextLong();
        }
        sc.close();

        long min = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            if (abcde[i] < min) {
                min = abcde[i];
            }
        }
        long diff = n / min;
        if (n % min != 0) {
            diff++;
        }
        long ans = 5 + (diff - 1);
        System.out.println(ans);
    }

}
