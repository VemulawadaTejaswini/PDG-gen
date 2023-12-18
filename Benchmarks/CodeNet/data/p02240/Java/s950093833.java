import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        String[] vals = line.split(" ");
        int n = Integer.parseInt(vals[0]);
        int m = Integer.parseInt(vals[1]);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            line = in.readLine();
            vals = line.split(" ");
            int s = Integer.parseInt(vals[0]);
            int t = Integer.parseInt(vals[1]);
            adj.get(s).add(t);
            adj.get(t).add(s);
        }
        ArrayList<HashSet<Integer>> connectedComponents = buildComponents(adj, n);
        line = in.readLine();
        int q = Integer.parseInt(line);
        for (int i = 0; i < q; i++) {
            line = in.readLine();
            vals = line.split(" ");
            int s = Integer.parseInt(vals[0]);
            int t = Integer.parseInt(vals[1]);
            System.out.println(isReachable(connectedComponents, s, t) ? "yes" : "no");
        }
    }

    private static boolean isReachable(ArrayList<HashSet<Integer>> connectedComponents, int s, int t) {
        for (HashSet<Integer> component : connectedComponents) {
            boolean containsS = component.contains(s);
            boolean containsT = component.contains(t);
            if (containsS && containsT) {
                return true;
            } else if (containsS) {
                return false;
            } else if (containsT) {
                return false;
            }
        }
        return false;
    }

    private static ArrayList<HashSet<Integer>> buildComponents(ArrayList<ArrayList<Integer>> adj, int n) {
        ArrayList<HashSet<Integer>> connectedComponents = new ArrayList<>();
        HashSet<Integer> explored = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!explored.contains(i)) {
                HashSet<Integer> connected = new HashSet<>();
                Queue<Integer> toDo = new LinkedList<>();
                toDo.offer(i);
                while (!toDo.isEmpty()) {
                    int next = toDo.poll();
                    explored.add(next);
                    connected.add(next);
                    ArrayList<Integer> neighbors = adj.get(next);
                    for (int neighbor : neighbors) {
                        if (!explored.contains(neighbor)) toDo.offer(neighbor);
                    }
                }
                connectedComponents.add(connected);
            }
        }
        return connectedComponents;
    }
}

