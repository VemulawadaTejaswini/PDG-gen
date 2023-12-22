import java.util.Scanner;

/**
 * Maximum Volume
 * 
 * https://atcoder.jp/contests/abc159/tasks/abc159_c
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int L = sc.nextInt();

        System.out.println(String.format("%.6f", Math.pow(L / 3.0, 3)));
    }

}
