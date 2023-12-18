import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] parent = new int[n + 1];
    int[] size = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      parent[i] = i;
      size[i] = 1;
    }
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      union(parent, size, a, b);
    }
	int maxSize = 0;
    for (int i = 1; i <= n; i++) {
      maxSize = Math.max(maxSize, size[i]);
    }
    System.out.println(maxSize);
  }

  private static int find(int[] parent, int node) {
    int root = node;
    while (root != parent[root]) {
      root = parent[root];
    }
    int currNode = node;
    while (currNode != root) {
      int nextNode = parent[currNode];
      parent[currNode] = root;
      currNode = nextNode;
    }
    return root;
  }

  private static void union(int[] parent, int[] size, int node1, int node2) {
  	int root1 = find(parent, node1);
    int root2 = find(parent, node2);
    if (root1 != root2) {
      if (size[root1] < size[root2]) {
        parent[root1] = root2;
        size[root2] += size[root1];
      } else {
        parent[root2] = root1;
        size[root1] += size[root2];
      }
    }
  }
}