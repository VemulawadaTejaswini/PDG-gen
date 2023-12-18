import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var nm = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

      final var ab = new int[nm[1]][2];
      for (int i = 0; i < nm[1]; i++) {
        final var l = br.readLine().split(" ");
        ab[i][0] = Integer.parseInt(l[0]);
        ab[i][1] = Integer.parseInt(l[1]);
      }

      final var nodes = new Node[nm[0]];
      for (int i = 0; i < nm[0]; i++) {
        nodes[i] = new Node();
        nodes[i].id = i;
        nodes[i].children = new HashSet<>();
      }

      for (int i = 0; i < ab.length; i++) {
        nodes[ab[i][0] - 1].children.add(nodes[ab[i][1] - 1]);
        nodes[ab[i][1] - 1].children.add(nodes[ab[i][0] - 1]);
      }

      // to set
      var checked = new HashSet<Integer>();
      var maxSize = 0;
      for (int i = 0; i < nm[0]; i++) {
        if (checked.contains(i)) continue;

        ArrayDeque<Node> q = new ArrayDeque<>();
        q.addLast(nodes[0]);

        final var friendSet = new HashSet<Integer>();
        while (!q.isEmpty()) {
          final var node = q.poll();
          friendSet.add(node.id);

          for (var c: node.children) {
            if (!friendSet.contains(c.id)) {
              q.add(c);
            }
          }
        }
        maxSize = Math.max(maxSize, friendSet.size());
        checked.addAll(friendSet);
      }

      System.out.println(maxSize);
    }
  }

  public static class Node {
    public int id;
    public Set<Node> children;
  }
}
