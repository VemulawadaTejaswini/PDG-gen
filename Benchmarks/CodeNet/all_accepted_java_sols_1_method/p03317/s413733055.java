import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), K = scanner.nextInt();
        int res = 1;
        int cur = K - 1;
        while (cur < N - 1) {
            cur += K - 1;
            res ++;
        }
        System.out.println(res);
    }
}
