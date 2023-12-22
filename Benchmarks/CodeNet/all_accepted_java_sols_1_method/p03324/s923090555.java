import java.util.Scanner;
public class Main {
    private static final int[] BASE = {1, 100, 10000};
    public static void main(String[] str) {
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt();
        int N = scan.nextInt();
        N = N == 100? 101: N;
        System.out.println(BASE[D] * N);
    }
}
