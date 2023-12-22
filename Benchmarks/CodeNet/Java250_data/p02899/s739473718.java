import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
            ans[ary[i] - 1] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");

        }
    }
}