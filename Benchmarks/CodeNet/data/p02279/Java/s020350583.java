import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();

        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            Node node = new Node(scanner);
            nodes[node.id] = node;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nodes[i].degree; j++) {
                nodes[nodes[i].children[j]].parent = i;
            }
        }
        for (int i = 0; i < n; i++) {
            int parent = nodes[i].parent;
            while (parent != -1) {
                nodes[i].depth++;
                parent = nodes[parent].parent;
            }
        }
        for (int i = 0; i < n; i++) {
            print(nodes[i]);
        }
    }

    public static void print(Node node) {
        System.out.println(
               "node " + node.id + ": " +
               "parent = " + node.parent + ", " +
               "depth = " + node.depth + ", " +
               getTypeString(node) + ", " +
               getChildrenString(node.children)
               );
    }

    private static String getTypeString(Node node) {
        if (node.parent == -1) {
            return "root";
        }
        if (node.children.length == 0) {
            return "leaf";
        }
        return "internal node";
    }

    private static String getChildrenString(int[] children) {
        if (children.length == 0) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[" + children[0]);
        for (int i = 1; i < children.length; i++) sb.append(", " + children[i]);
        sb.append("]");
        return sb.toString();
    }
}

class Node {
    int id;
    int parent = -1;
    int degree;
    int depth = 0;
    int[] children;

    Node(Scanner scanner) {
        id       = scanner.nextInt();
        degree   = scanner.nextInt();
        children = new int[degree];
        for (int i = 0; i < degree; i++) {
            children[i] = scanner.nextInt();
        }
    }

}

