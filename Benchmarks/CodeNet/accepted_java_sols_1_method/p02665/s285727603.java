
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt() + 1;
        in.nextLine();
        final int[] leaves = new int[n];
        long branch = 0;
        for (int i = 0; i < n; i++) {
            leaves[i] = in.nextInt();
            branch += leaves[i];
        }
        branch--;
        long res = 0;
        long nowLeaf = 1;
        for (int i = 0; i < n; i++) {
            res += nowLeaf;
            nowLeaf -= leaves[i];
            if (nowLeaf < 0) {
                res = -1;
                break;
            }
            if (nowLeaf <= branch) {
                branch -= nowLeaf;
                nowLeaf *= 2;
            } else {
                nowLeaf += branch;
                branch = 0;
            }
        }
        System.out.println(res);
    }
}
