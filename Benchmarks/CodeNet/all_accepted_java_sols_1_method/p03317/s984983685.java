import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
        }
        int ans = (int)Math.ceil((double)(n - 1) / (k - 1));

        System.out.println(ans);

    }
}