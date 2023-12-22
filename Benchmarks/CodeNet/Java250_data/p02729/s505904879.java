import java.util.*;

class Main {

    static public int solve(int N, int M) {
        return M*(M-1)/2 + N*(N-1)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        sc.close();

        System.out.println(solve(N, M));

    }
}