import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] u = new int[M];
            int[] v = new int[M];
            ArrayList<Integer>[] v2 = new ArrayList[N];
            for (int i = 0; i < v2.length; i++) {
                v2[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < M; i++) {
                u[i] = in.nextInt() - 1;
                v[i] = in.nextInt() - 1;
                v2[u[i]].add(v[i]);
            }
            int S = in.nextInt() - 1;
            int T = in.nextInt() - 1;

//            ArrayList<Integer>[] v3 = new ArrayList[N];
//            for (int i = 0; i < v3.length; i++) {
//                v3[i] = new ArrayList<Integer>();
//            }
//            for (int i = 0; i < N; i++) {
//                for (Integer vertex : v2[i]) {
//                    for (Integer vertex2 : v2[vertex]) {
//                        for (Integer vertex3 : v2[vertex2]) {
//                            if (!v3[i].contains(vertex3)) {
//                                v3[i].add(vertex3);
//                            }
//                        }
//                    }
//                }
//            }

            LinkedList<Integer> queue = new LinkedList<>();
            boolean[][] used = new boolean[3][N];
            {
                queue.add(S);
                queue.add(0);
                used[0][S] = true;
            }
            for (; !queue.isEmpty();) {
                int n = queue.pollFirst().intValue();
                int dist = queue.pollFirst().intValue();
                if (dist % 3 == 0 && n == T) {
                    System.out.println(dist / 3);
                    return;
                }
                for (Integer vertex : v2[n]) {
                    if (used[(dist + 1) % 3][vertex.intValue()]) {
                        continue;
                    }
                    used[(dist + 1) % 3][vertex.intValue()] = true;
                    queue.add(vertex.intValue());
                    queue.add(dist + 1);
                }
            }
            System.out.println(-1);
        }
    }

}
