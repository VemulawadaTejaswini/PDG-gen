import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    
    private static class Edge {
        final int left;
        final int right;
        
        Edge(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        
        TreeSet<Edge> es = new TreeSet<>(Comparator.comparing(e -> Math.min(e.left, e.right)));
        es.add(new Edge(A[N - 1], A[N - 2]));
        es.add(new Edge(A[N - 2], A[N - 1]));
        long comfort = A[N - 1];
        
        for (int i = N - 3; 0 <= i; i--) {
            Edge e = es.pollLast();
            comfort += Math.min(e.left, e.right);
            es.add(new Edge(e.left, A[i]));
            es.add(new Edge(A[i], e.right));
        }
        
        System.out.println(comfort);
    }
}
