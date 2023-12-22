import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int ans = 0;
        int max = -1;
        for (int i = 1; i <= N; i++) {
            if (Integer.numberOfTrailingZeros(i) > max) {
                max = Integer.numberOfTrailingZeros(i);
                ans = i;
            }
        }
        System.out.println(ans);
    }

}
