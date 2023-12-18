import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int num = 1;
        for (int i = 0; i < N; i++) {
            num = Math.min(num * 2, num + K);
        }
        System.out.println(num);
    }
}
