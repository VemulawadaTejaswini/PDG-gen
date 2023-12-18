import java.util.*;

public class Main {

    public static class Pair<A, B>{
        public A a;
        public B b;

        public Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }

    public static Integer dfs(int node, 
                              HashMap<Integer, List<Integer>> graph,
                              int currTime,
                              HashSet<Integer> discovered, 
                              HashMap<Integer, Pair<Integer, Integer>> times) {

        if(discovered.contains(node))
            return currTime - 1;
        else;
            int startTime = currTime;
            discovered.add(node);
            for(int i : graph.get(node)) {
                currTime  = dfs(i, graph, currTime + 1, discovered, times); 
            }
            times.put(node, new Pair<>(startTime, currTime + 1));
            return currTime + 1;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int vs = sc.nextInt();
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < vs; i++) {
            int currNode = sc.nextInt();
            int es = sc.nextInt();
            List<Integer> edges = new LinkedList<>();
            for(int j = 0; j < es; j++)
                edges.add(sc.nextInt());
            graph.put(currNode, edges);
        }
        HashMap<Integer, Pair<Integer, Integer>> times = new HashMap<>();
        HashSet<Integer> discovered = new HashSet<>();
        int lastTime = 1;
        for (int i = 1; i <= graph.size(); i++) {
            if(!times.containsKey(i))
                lastTime += dfs(i, graph, lastTime, discovered, times);
                //lastTime += dfs(1, graph, lastTime, new HashSet<>(), times);
        }

        for (int i = 1; i <= graph.size(); i++) {
            if(times.containsKey(i)) {
                Pair<Integer, Integer> p = times.get(i);
                System.out.println(i + " " + p.a + " " + p.b);
            }
        }
    
    }

}

