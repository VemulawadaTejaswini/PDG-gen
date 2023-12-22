import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    static String s, t;

    public static void main(String[] args) {
        input();
        solve();
    }

    static void solve() {
        s = s + s + s;
        int l = t.length();
        for(int i = 0; i < l; i++) {
            if(s.substring(i, i+l).equals(t)) {
                print("Yes");
                return;
            }
        }

        print("No");
    }

    static void input() {
        Scanner in = new Scanner(System.in);
        s = in.next();
        t = in.next();
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(char c) {
        System.out.println(c);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }

    static void print(float i) {
        System.out.println(i);
    }

    static void printArray2D(int[][] array, char del) {
        int r = array.length;
        int c = array[0].length;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.format("%3d", array[i][j]);
                if(j != c-1) System.out.print(del);
                else System.out.print('\n');
            }
        }
    }
}