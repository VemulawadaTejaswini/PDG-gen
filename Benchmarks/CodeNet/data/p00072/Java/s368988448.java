import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            int n = Integer.parseInt(line);
            if (n == 0) {
                break;
            }
            int m = Integer.parseInt(reader.readLine());
            int[][] graph = new int[m][3];
            for (int i = 0; i < m; i++) {
                String[] values = reader.readLine().split(",");
                graph[i][0] = Integer.parseInt(values[0]);
                graph[i][1] = Integer.parseInt(values[1]);
                graph[i][2] = Integer.parseInt(values[2]) / 100 - 1;
            }
            Arrays.sort(graph, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[2] - o2[2];
                }
            });
            int result = solve(n, graph);
            out.println(result);
        }
    }

    private static int solve(int n, int[][] graph) {
        int[] treeNumbers = new int[n];
        int lastTreeNumber = 0;
        int result = 0;
        for (int i = 0; i < graph.length; i++) {
            int[] edge = graph[i];
            int treeNumber0 = treeNumbers[edge[0]];
            int treeNumber1 = treeNumbers[edge[1]];
            if (treeNumber0 == 0) {
                if (treeNumber1 == 0) {
                    lastTreeNumber++;
                    treeNumbers[edge[0]] = lastTreeNumber;
                    treeNumbers[edge[1]] = lastTreeNumber;
                } else {
                    treeNumbers[edge[0]] = treeNumber1;
                }
            } else {
                if (treeNumber1 == 0) {
                    treeNumbers[edge[1]] = treeNumber0;
                } else if (treeNumber1 == treeNumber0) {
                    continue;
                } else {
                    for (int j = 0; j < n; j++) {
                        if (treeNumbers[j] == treeNumber1) {
                            treeNumbers[j] = treeNumber0;
                        }
                    }
                }
            }
            result += edge[2];
        }
        return result;
    }
}