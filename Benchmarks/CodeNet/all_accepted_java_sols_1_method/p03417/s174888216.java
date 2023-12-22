import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long N = (n == 1) ? 1 : n - 2;
        long M = (m == 1) ? 1 : m - 2;
        System.out.println(N * M);
    }
}