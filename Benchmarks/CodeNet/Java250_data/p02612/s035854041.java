import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        int ans = thousands(total);
        System.out.println(ans);
    }

    // N = 1900;
    public static int thousands(int N) {
        int total = 0;
        for (total = 1000; total < N; total = total + 1000) {
        }
        return total - N;
    }

}

