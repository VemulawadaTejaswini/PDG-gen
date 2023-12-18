    import java.util.Scanner;
     
    public class Main {
     
    static Scanner sc = new Scanner(System.in);
    static int N, K, R;
    static int[][] m;
    static boolean hate[][];
     
    static int solve() {
    int ans = 0;
    for (int i = 0; i < K; ++i) {
    for (int j = 0; j < m[i].length; ++j) {
    int r = m[i][j];
    for (int k = 0; k < m[i].length; ++k) {
    if (hate[r][m[i][k]]) {
    ++ans;
    break;
    }
    }
    }
    }
    return ans;
    }
     
    public static void main(String[] args) {
    N = sc.nextInt();
    K = sc.nextInt();
    m = new int[K][];
    for (int i = 0; i < K; ++i) {
    int mi = sc.nextInt();
    m[i] = new int[mi];
    for (int j = 0; j < mi; ++j) {
    m[i][j] = sc.nextInt() - 1;
    }
    }
    R = sc.nextInt();
    hate = new boolean[N][N];
    for (int i = 0; i < R; ++i) {
    int p = sc.nextInt() - 1;
    int q = sc.nextInt() - 1;
    hate[p][q] = hate[q][p] = true;
    }
    System.out.println(solve());
    }
    }