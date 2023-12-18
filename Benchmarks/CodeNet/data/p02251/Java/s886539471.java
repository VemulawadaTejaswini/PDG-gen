import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge {
    int to;
    int cost;

    Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}

class Pair implements Comparable<Pair> {
    int dist;
    int index;

    Pair(int dist, int index) {
        this.dist = dist;
        this.index = index;
    }

    public int compareTo(Pair p2) {
        return dist - p2.dist;
    }
}
 
public class Main {
    static final int INF = 2000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();

        int res = 0;
        int[] coin = {1, 5, 10, 25};
        for(int i = coin.length - 1; i >= 0; i--) {
            res += n / coin[i];
            n %= coin[i];
        }

        System.out.println(res);
 
        sc.close();
    }
}
