import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int[] A;

    static boolean solve(int i, int m) {
        if (m == 0) return true;
        else if (i >= n) return false;
        // A[i]を使わないパターンと使うパターン
        else return solve(i + 1, m) || solve(i + 1, m - A[i]);
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(in.readLine());
            A = new int[n];
            String[] line = in.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(line[i]);
            }

            int q = Integer.parseInt(in.readLine());
            line = in.readLine().split(" ");
            for (int i = 0; i < q; i++) {
                int m = Integer.parseInt(line[i]);
                if (solve(0, m))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

