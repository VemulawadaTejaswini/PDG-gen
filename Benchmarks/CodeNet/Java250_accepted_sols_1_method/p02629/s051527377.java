import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long[] num = new long[50];
        int k = 0;
        while(N > 0) {
            num[++k] = (N - 1) % 26;
            N--;
            N /= 26;
        }
        String ans = "";
        for (int i = k; i > 0; i--) {
            char c = (char) (97 + num[i]);
            ans += c;
        }
        System.out.println(ans);
    }
}