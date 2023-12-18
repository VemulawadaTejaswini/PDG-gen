import java.util.Scanner;

class Main {
    public static int[] a;
    public static int n;
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] m = new int[q];
        for (int i = 0; i < q; i++){
            m[i] = sc.nextInt();
        }

        for(int number : m){
            if (solve(0, number)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean solve(int i, int m) {
        if (m == 0) {
            return true;
        }

        if (i >= n) {
            return false;
        }

        boolean res = solve(i + 1, m) || solve(i + 1, m - a[i]);
        return res;
    }
}

