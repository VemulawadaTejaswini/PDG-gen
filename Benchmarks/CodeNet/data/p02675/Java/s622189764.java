import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int[][] route;
    static HashSet<Integer> visited;
    static int N;
    static int M;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        route = new int[N + 1][N + 1];

        for (int i = 0; i < N + 1; i++) {
            Arrays.fill(route[i], 0);
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            route[A][B] = 1;
            route[B][A] = 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < N + 1; i++) {
            int ans = getPath(i);
            if (i == 2 && ans == -1) {
                sb.append("No");
                break;
            } else if (i == 2) {
                sb.append("Yes");
                sb.append("\n");
            }
            sb.append(ans);
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

    public static int getPath(int index) {
        int startNum = Integer.MAX_VALUE;
        int minPath = Integer.MAX_VALUE;
        for (int i = 1; i < N + 1; i++) {
            visited = new HashSet<>();
            visited.add(index);
            count = 0;

            if (route[index][i] == 1) {
                if (i == 1) {
                    return 1;
                }
                ++count;
                visited.add(i);
                dfs(i);

                if (visited.contains(1)) {
                    minPath = Math.min(count, minPath);
                    startNum = count <= minPath ? i : startNum;
                }
            }
        }
        return startNum;
    }

    public static void dfs(int index) {
        for (int i = 1; i < N + 1; i++) {
            if (route[index][i] == 1 && !visited.contains(i)) {
                ++count;
                if (i == 1) {
                    visited.add(1);
                    break;
                } else {
                    visited.add(i);
                    dfs(i);
                }
            }
        }
    }
}
