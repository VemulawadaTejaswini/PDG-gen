import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AtCoder problem = new AtCoder(sc);
        problem.solve();
        sc.close();
    }

}

class AtCoder {

    /* 変数宣言 */
    final int N, M;
    List<List<Integer>> root;

    AtCoder(Scanner sc) {
        N = sc.nextInt();
        M = sc.nextInt();

        root = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            root.add(new ArrayList<>());
        }
        root.get(0).add(0);
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            root.get(a).add(b);
            root.get(b).add(a);
        }
    }

    void solve() {
        List<Integer> visited = new ArrayList<>();
        List<List<Integer>> costList;
        int[] sign = new int[N];

        costList = new ArrayList<>();
        costList.add(new ArrayList<>());

        //System.out.println("root = " + root);

        costList.get(0).add(1);
        visited.add(1);
        //System.out.println("visted=" + visited+", costList="+costList);

        for (int i = 1; i <= N && visited.size() < N; i++) {
            for (Integer c : costList.get(i - 1)) {
                for (Integer r : root.get(c)) {
                    if (!visited.contains(r)) {
                        if (costList.size() <= i) {
                            costList.add(new ArrayList<>());
                        }
                        sign[r - 1] = c;
                        costList.get(i).add(r);
                        visited.add(r);
                        //System.out.println("visted=" + visited+", costList="+costList);
                    }
                }
            }
        }
        //System.out.println(costList);
        //System.out.println(costList.size());
        if (visited.size() == N) {
            System.out.println("Yes");
            for (int i = 1; i < sign.length; i++) {
                System.out.println(sign[i]);
            }
        } else {
            System.out.println("No");
        }
    }
}