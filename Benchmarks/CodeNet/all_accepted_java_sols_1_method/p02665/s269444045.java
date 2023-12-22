
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        List<Long> leaf = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            leaf.add(sc.nextLong());
        }
        List<Long> accLeaf = new ArrayList<>();
        accLeaf.add(0L);
        long acc  = 0L;
        for (int i = 0; i < n; i++) {
            acc += leaf.get(i);
            accLeaf.add(acc);
        }

        long  ans = 1;
        long  nonLeaf;
        long  vertexes = 1;
        for (int i = 1; i < n; i++) {
            nonLeaf = vertexes - leaf.get(i-1);
            if (nonLeaf <= 0) {
                System.out.println(-1);
                return;
            }
            vertexes = Math.min(2*nonLeaf, accLeaf.get(n)-accLeaf.get(i));
            ans += vertexes;
        }
        if (vertexes != leaf.get(n-1)) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }
}
