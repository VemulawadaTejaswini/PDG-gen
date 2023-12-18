
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int  n = scanner.nextInt();
    Tree tree = new Tree();
    Node[] nodes = new Node[n];
    for (int i = 0; i < n; i++) {
      int x = scanner.nextInt(), y = scanner.nextInt();
      nodes[i] = tree.insert(x,y);
    }
    for (Node node: nodes) {
      System.out.println(1+tree.findSmaller(node) + tree.findBigger(node));
    }
  }

  static class Tree {
    Node root = null;
    public Node insert(int x, int y) {
      Node node = new Node(x,y);
      root = insert(root, node, true);
      return node;
    }

    private Node insert(Node root, Node node, boolean sortByX) {
      if (root==null)
        return node;
      if (sortByX) {
        if (root.x<node.x)
          root.left = insert(root.left, node, !sortByX);
        else
          root.right = insert(root.right, node, !sortByX);
      } else {
        if (root.y<node.y)
          root.left = insert(root.left, node, !sortByX);
        else
          root.right = insert(root.right, node, !sortByX);
      }
      return root;
    }

    public int findSmaller(Node node) {
      return findSmaller(node, root, true);
    }

    private int findSmaller(Node node, Node root, boolean sortByX) {
      if (root==null)return 0;
      if (sortByX) {
        if (node.x<root.x) {
          return ((node.y<root.y)?1:0)+
              findSmaller(node, root.left, !sortByX)+
              findSmaller(node, root.right, !sortByX);
        } else {
          return findSmaller(node, root.left, !sortByX);
        }
      } else {
        if (node.y<root.y) {
          return ((node.x<root.x)?1:0)+
              findSmaller(node, root.left, !sortByX)+
              findSmaller(node, root.right, !sortByX);
        } else {
          return findSmaller(node, root.left, !sortByX);
        }
      }
    }

    public int findBigger(Node node) {
      return findBigger(node, root, true);
    }

    private int findBigger(Node node, Node root, boolean sortByX) {
      if (root==null)return 0;
      if (sortByX) {
        if (node.x>root.x) {
          return ((node.y>root.y)?1:0)+
              findBigger(node, root.left, !sortByX)+
              findBigger(node, root.right, !sortByX);
        } else {
          return findBigger(node, root.right, !sortByX);
        }
      } else {
        if (node.y>root.y) {
          return ((node.x>root.x)?1:0)+
              findBigger(node, root.left, !sortByX)+
              findBigger(node, root.right, !sortByX);
        } else {
          return findBigger(node, root.right, !sortByX);
        }
      }
    }
  }

  static class Node {
    final int x,y;
    Node left, right;

    Node(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
