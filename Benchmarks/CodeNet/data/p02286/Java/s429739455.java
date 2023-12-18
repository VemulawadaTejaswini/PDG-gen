import java.util.Scanner;
import java.util.ArrayList;
public class Main {

  public static class Node {
    int key;
    int priority;
    Node left;
    Node right;
    Node p;
    public Node(int key, int priority) {
      this.key = key;
      this.priority = priority;
      this.left = null;
      this.right = null;
      this.p = null;
    }
  }

  public static class Tree {
    Node root;
    public Tree() {
      this.root = null;
    }
  }

  public static Node rightRotate(Node t) {
    Node s = t.left;
    t.left = s.right;
    s.right = t;
    return s;
  }

  public static Node leftRotate(Node t) {
    Node s = t.right;
    t.right = s.left;
    s.left = t;
    return s;
  }

  public static Node insert(Node t, int key, int priority) {
    if (t == null)
      return new Node(key, priority);
    if (key == t.key)
      return t;
    if (key < t.key) {
      t.left = insert(t.left, key, priority);
      if (t.priority < t.left.priority)
        t = rightRotate(t);
    } else {
      t.right = insert(t.right, key, priority);
      if (t.priority < t.right.priority)
        t = leftRotate(t);
    }
    return t;
  }

  public static boolean find_helper(Node x, int k) {
    if (x == null)
      return false;
    if (x.key == k)
      return true;
    if (k <= x.key)
      return find_helper(x.left, k);
    else
      return find_helper(x.right, k);
  }

  public static String find(Node x, int k) {
    if (find_helper(x, k))
      return "yes";
    return "no";
  }

  public static Node delete(Node t, int key) {
    if (t == null)
      return null;
    if (key < t.key)
      t.left = delete(t.left, key);
    else if (key > t.key)
      t.right = delete(t.right, key);
    else
      return deleteHelper(t, key);
    return t;
  }

  public static Node deleteHelper(Node t, int key) {
    if (t.left == null && t.right == null)
      return null;
    else if (t.left == null)
      t = leftRotate(t);
    else if (t.right == null)
      t = rightRotate(t);
    else {
      if (t.left.priority > t.right.priority)
        t = rightRotate(t);
      else
        t = leftRotate(t);
    }
    return delete(t, key);
  }

  public static String print_inorder(Node x) {
    String a = "";
    if (x != null) {
      a = a + print_inorder(x.left);
      a = a + " " + x.key;
      a = a + print_inorder(x.right);
    }
    return a;
  }

  public static String print_preorder(Node x) {
    String a = "";
    if (x != null) {
      a = a + " " + x.key;
      a = a + print_preorder(x.left);
      a = a + print_preorder(x.right);
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    ArrayList<String> results = new ArrayList<String>();
    Tree T = new Tree();
    for (int i = 0; i < m; i++) {
      String cmd = s.next();
      switch(cmd) {
        case "insert":
          int key = s.nextInt();
          int priority = s.nextInt();
          T.root = insert(T.root, key, priority);
          break;
        case "find":
          int k = s.nextInt();
          results.add(find(T.root, k));
          break;
        case "delete":
          k = s.nextInt();
          T.root = delete(T.root, k);
          break;
        case "print":
          results.add(print_inorder(T.root));
          results.add(print_preorder(T.root));
          break;
        default:
          break;
      }
    }
    s.close();
    for (String result : results) {
      System.out.println(result);
    }
  }
}

