import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int xs[] = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = in.nextInt();
        }

        int ys[] = new int[m];
        for (int i = 0; i < m; i++) {
            ys[i] = in.nextInt();
        }

        String ans = "No War";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (xs[i] >= ys[j] || xs[i] >= y || ys[j] <= x) {
                    ans = "War";
                } 
            }
        }

        System.out.println(ans);
    }
}
