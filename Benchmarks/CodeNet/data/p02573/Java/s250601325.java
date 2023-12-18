import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Graph graph = new Graph(false);

        for(int i = 0; i < n; i++){
            graph.addNode();
        }

        for(int i = 0; i < m; i++){
            graph.addEdge(sc.nextInt() - 1, sc.nextInt() - 1);
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            Graph.Node node = graph.getNode(i);
            if(node.check){
                continue;
            }
            max = Math.max(max, node.bfs(0));
        }

        System.out.println(max);

    }
}

class Graph{
    boolean directed;
    List<Node> nodeList;
    List<Edge> allEdgeList;

    Graph(boolean directed){
        this.directed = directed;
        this.nodeList = new ArrayList<>();
        this.allEdgeList = new ArrayList<>();
    }

    Node getNode(int n){
        return nodeList.get(n);
    }

    void addNode(){
        nodeList.add(new Node(nodeList.size()));
    }

    void addEdge(int from, int to, int cost, boolean directed){
        nodeList.get(from).addEdge(nodeList.get(to), cost, directed);
    }

    void addEdge(int from, int to, int cost){
        nodeList.get(from).addEdge(nodeList.get(to), cost, directed);
    }

    void addEdge(int from, int to, boolean directed){
        nodeList.get(from).addEdge(nodeList.get(to), 0, directed);
    }

    void addEdge(int from, int to){
        nodeList.get(from).addEdge(nodeList.get(to), 0, directed);
    }

    class Node{
        int num;
        boolean check;
        int count;
        List<Edge> edgeList;
        List<Edge> revEdgeList;

        Node(int num){
            this.num = num;
            this.edgeList = new ArrayList<>();
            this.revEdgeList = new ArrayList<>();
        }

        int bfs(int c){
            if(this.check){
                return c;
            }
            c++;
            this.check = true;
            for(int j = 0; j < this.edgeList.size(); j++){
                Graph.Node to = this.edgeList.get(j).to;
                c = to.bfs(c);
            }
            return c;
        }

        void addEdge(Node node, int cost, boolean directed){
            Edge edge = new Edge(this, node, cost);
            edgeList.add(edge);
            node.revEdgeList.add(edge);
            allEdgeList.add(edge);
            if(!directed){
                edge = new Edge(node, this, cost);
                node.edgeList.add(edge);
                revEdgeList.add(edge);
                allEdgeList.add(edge);
            }
        }

        void addEdge(Node node, boolean directed){
            addEdge(node, 0, directed);
        }

        void addEdge(Node node, int cost){
            addEdge(node, cost, directed);
        }

        void addEdge(Node node){
            addEdge(node,0, directed);
        }

        List<Node> nodeList(){
            List<Node> result = new ArrayList<>();
            for(Edge edge : edgeList){
                result.add(edge.to);
            }
            return result;
        }
    }

    static class Edge{
        Node from;
        Node to;
        int cost;

        Edge(Node from, Node to, int cost){
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
}