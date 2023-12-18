/*
@author James Fisher
@date
@version
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Graph2 {
    private int totalVertex;
    private LinkedList<LinkedList<Integer>> adjList;
    private int[] completion;
    private boolean[] seen;
    private int[] indegree;

    // adjacency list of edges
    Graph2() {
        totalVertex = 0;
    }

    void loadAdjList() {
        Scanner in = new Scanner(System.in);
        totalVertex = in.nextInt();
        completion = new int[totalVertex];
        seen = new boolean[totalVertex];
        indegree = new int[totalVertex];

        int totalEdges = in.nextInt();
        adjList = new LinkedList<LinkedList<Integer>>();

        for(int i = 0; i < totalVertex ; i++) {
            LinkedList<Integer> tmp = new LinkedList<Integer>();
            adjList.add(tmp);
        }

        for (int i = 0; i < totalEdges; i++) {
            int vert = in.nextInt();
            int out = in.nextInt();
            adjList.get(vert).add(out);
            indegree[out]++;
        }

        in.close();
    }


    void isEligible() {
        Queue<Integer> eligible = new LinkedList<Integer>();
        for(int i = 0; i < totalVertex; i++) {
            if(indegree[i] == 0) {
                eligible.add(i);
            }
        }

        while(!eligible.isEmpty()) {
            int cur = eligible.poll();
            System.out.println(cur);
            for(Integer n : adjList.get(cur)) {
                indegree[n]--;
                if(indegree[n] == 0) {
                    eligible.add(n);
                }
            }
        }
    }
}
public class Main{
    public static void main(String argv[]) {
        Graph2 g = new Graph2();
        g.loadAdjList();
        g.isEligible();
    }
}

