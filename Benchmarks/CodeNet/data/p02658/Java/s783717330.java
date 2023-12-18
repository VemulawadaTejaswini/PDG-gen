import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = sc.nextLong();
        for (int i = 1; i < N; i++) {
            ans *= sc.nextLong();
        }
        System.out.println(1000000000000000000L < ans ? -1 : ans);
    }
}