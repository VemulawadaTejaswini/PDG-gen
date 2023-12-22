import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int D = scan.nextInt();
        int N = scan.nextInt();
        System.out.println(solve(D, N));
    }
    public static int solve(int D, int N) {
        if (D == 0) {
            return N != 100 ? N : 101;
        }
        if (N != 100) {
            return (int) Math.pow(100, D) * N;
        }
        return (int) Math.pow(100, D+1) + (int) Math.pow(100, D);
    }
}
