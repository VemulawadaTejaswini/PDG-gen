import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(calc(N));
        sc.close();
        return;
    }

    static String calc(long N) {
        if (N == 0) {
            return "";
        }
        N--;
        return calc(N / 26) + (char) ('a' + N % 26);
    }
}
