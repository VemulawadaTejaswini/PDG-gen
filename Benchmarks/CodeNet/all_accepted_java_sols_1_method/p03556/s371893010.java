import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i * i > N) {
                ans = i;
                break;
            }
        }
        System.out.println((ans - 1)*(ans - 1));
    }
}
