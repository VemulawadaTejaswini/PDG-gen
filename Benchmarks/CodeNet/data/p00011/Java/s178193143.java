
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] perm = new int[w];
        for (int i = 0; i < w; i++) {
            perm[i] = i;
        }
        for (int i = 0; i < n; i++) {
            String[] swap = sc.next().split(",", 0);
            int tmp = perm[Integer.parseInt(swap[0]) - 1];
            perm[Integer.parseInt(swap[0]) - 1] = perm[Integer.parseInt(swap[1]) - 1];
            perm[Integer.parseInt(swap[1]) - 1] = tmp;
        }
        for (int i = 0; i < w; i++) {
            System.out.println(perm[i] + 1);
        }

    }
}
