import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        List<Integer> leaf = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            leaf.add(sc.nextInt());
        }
        if (leaf.get(0) != 0) {
            System.out.println(-1);
            return;
        }

        List<Integer> accList = new ArrayList<>();
        accList.add(0);
        int acc  = 0;
        for (int i = 0; i < n; i++) {
            acc += leaf.get(i);
            accList.add(acc);
        }

        int ans = 1;
        int nonLeaf;
        int vertexes = 1;
        for (int i = 1; i < n; i++) {
            nonLeaf = vertexes - leaf.get(i-1);
            if (nonLeaf < 0) {
                System.out.println(-1);
                return;
            }
            vertexes = Math.min(2*nonLeaf, accList.get(n)-accList.get(i));
            ans += vertexes;
        }

        System.out.println(ans);
    }
}
