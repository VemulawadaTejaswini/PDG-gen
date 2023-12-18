import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static ArrayList<ArrayList<Integer>> adjList;
    private static int[][] weights;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        weights = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = in.readLine();
            String[] data = line.split(" ");
            int u = Integer.parseInt(data[0]);
            int k = Integer.parseInt(data[1]);
            for (int j = 0; j < k*2; j+=2) {
                int v = Integer.parseInt(data[j+2]);
                int c = Integer.parseInt(data[j+3]);
                weights[u][v] = c;
                adjList.get(u).add(v);
            }
        }
        in.close();
        int[] dist = minDist();
        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }

    private static int[] minDist() {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<Integer> fringe = new PriorityQueue<>(Comparator.comparingInt(x -> dist[x]));
        fringe.offer(0);
        while (!fringe.isEmpty()) {
            int u = fringe.poll();
            for (int v : adjList.get(u)) {
                int newDist = dist[u] + weights[u][v];
                if (newDist < dist[v]) {
                    fringe.remove(v);
                    dist[v] = newDist;
                    fringe.offer(v);
                }
            }
        }
        return dist;
    }
}


