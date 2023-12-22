import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        int st = 0;
        int gl = 0;

        for (int i = 0; i < m; i++) {
            int y = Integer.parseInt(sc.next());
            ary[y] = 1;
        }
        for (int i = x; i < n; i++) {
            gl += ary[i];
        }
        for (int i = x; 0 < i; i--) {
            st += ary[i];
        }
        System.out.println(Math.min(st,gl));
    }
}
