
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Deque<Integer> queue = new ArrayDeque<Integer>();
    static List<List<Integer>> edgeList = new ArrayList<List<Integer>>();
    static int[] distArray;
    static int[] route;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());

        for (int i = 0; i <= n; i++) {
            edgeList.add(new ArrayList<Integer>());
        }
        distArray = new int[n + 1];
        Arrays.fill(distArray, -1);
        route = new int[n + 1];
        Arrays.fill(route, -1);

        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            edgeList.get(a).add(b);
            edgeList.get(b).add(a);
        }
        scan.close();

        addNode(0, 1, 0);
        while (!queue.isEmpty()) {
            int curNode = queue.poll();
            for (int i : edgeList.get(curNode)) {
                addNode(curNode, i, distArray[curNode] + 1);
            }
        }

        for (int i = 1; i <= n; i++) {
            if (distArray[i] == -1) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        for (int i = 2; i <= n; i++) {
            System.out.println(route[i]);
        }

    }

    private static void addNode(int from, int node, int dist) {
        if (distArray[node] != -1) {
            return;
        }

        route[node] = from;
        distArray[node] = dist;
        queue.add(node);
    }

}
