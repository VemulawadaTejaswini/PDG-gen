import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());
        int C = Integer.parseInt(sc.nextLine());
        int X = Integer.parseInt(sc.nextLine());

        int ans = 0;
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int j2 = 0; j2 <= C; j2++) {
                    int sum = i * 500 + j * 100 + j2 * 50;
                    if (sum == X) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
