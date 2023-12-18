import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
        }
        int q = in.nextInt();
        int[] t = new int[q];
        for (int i = 0; i < q; i++) {
            t[i] = in.nextInt();
        }

        int c = 0;
        for (int i : t) {
            if (linearSearch(s, i)) {
                c++;
            }
        }
        System.out.println(c);
    }

    private static boolean linearSearch(int[] s, int val) {
        for (int i : s) {
            if (val == i) {
                return true;
            }
        }
        return false;
    }
}

