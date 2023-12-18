import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    class Edge {
        int dst;

        public Edge(int dst){
            this.dst  = dst;
        }
    }

    class Node{
        boolean isFinished = false;
        int minCost = Integer.MAX_VALUE;
        int num;
        int dst;
        ArrayList<Edge> edges = new ArrayList<Edge>();

        public void addEdge(Edge edge){
            edges.add(edge);
        }
    }

    public Main(){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        Node[] nodes = new Node[N];
        for(int i=0;i<N;i++){
            nodes[i] = new Node();
            nodes[i].num = i+1;
        }

        for(int i=0;i<M;i++){
            int A = Integer.parseInt(sc.next())-1;
            int B = Integer.parseInt(sc.next())-1;

            nodes[A].addEdge(new Edge(B));
            nodes[B].addEdge(new Edge(A));
        }

        PriorityQueue<Node> queue = new PriorityQueue<Node>(new Comparator<Node>(){
            @Override
            public int compare(Node a, Node b){
                return a.minCost - b.minCost;
            }
        });

        nodes[0].minCost = 0;
        queue.add(nodes[0]);
        while(queue.size() != 0){
            Node n = queue.poll();
            if(n.isFinished)continue;

            for(Edge e : n.edges){
                if(nodes[e.dst].isFinished) continue;

                if(nodes[e.dst].minCost > n.minCost + 1){
                    nodes[e.dst].minCost = n.minCost + 1;
                    nodes[e.dst].dst = n.num;
                    queue.add(nodes[e.dst]);
                }
            }
            n.isFinished = true;
        }

        System.out.println("Yes");
        for(int i=1;i<N;i++){
            System.out.println(nodes[i].dst);
        }

    }

    public static void main(String[] args) {
        Main M = new Main();
    }
}
