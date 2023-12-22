import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();
        int N = sc.nextInt();
        long A = 0;

        for (int i = 0; i < N; i++)
            A += sc.nextLong();

        System.out.println(A >= H ? "Yes" : "No");
    }
}
