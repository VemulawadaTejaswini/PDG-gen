import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  private final static String INSERT = "insert";
  private static Tree ROOT = null;
  private static Tree END = null;

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int times = Integer.parseInt(sc.next());
    List<Tree> tree = new ArrayList<>(times - 1);

    for (int i = 0; i < times; i++) {
      if (sc.next().equals(INSERT)) {
        insert(tree, Integer.parseInt(sc.next()));
      } else {
        setEnd();

        StringBuilder sb = new StringBuilder();
        createBuilderInorder(ROOT, sb);
        System.out.println(sb.deleteCharAt(sb.length() - 1));

        sb = new StringBuilder();
        createBuilderByRoot(ROOT, sb);
        System.out.println(sb.deleteCharAt(sb.length() - 1));
      }
    }
  }

  public static void insert(List<Tree> tree, int key) {
    Tree y = null;
    Tree x = ROOT;
    Tree z = new Tree();
    z.key = key;

    while (x != null) {
      y = x;
      if (z.key < x.key) {
        x = x.left;
      } else {
        x = x.right;
      }
    }

    z.parent = y;

    if (y == null) {
      tree.add(z);
      ROOT = z;
    } else if (z.key < y.key) {
      y.left = z;
      tree.add(z);
    } else {
      y.right = z;
      tree.add(z);
    }
  }

  public static void setEnd() {
    Tree current = ROOT;
    while (current.right != null) {
      current = current.right;
    }

    END = current;
  }

  public static void createBuilderInorder(Tree tree, StringBuilder sb) {
    if (tree != null) {
      createBuilderInorder(tree.left, sb);
      sb.append(tree.key).append(" ");
      createBuilderInorder(tree.right, sb);
    }
  }

  public static void createBuilderByRoot(Tree tree, StringBuilder sb) {
    if (tree != null) {
      sb.append(tree.key).append(" ");
      createBuilderByRoot(tree.left, sb);
      createBuilderByRoot(tree.right, sb);
    }
  }

  public static void printArr() {

  }
}

class Tree {
  public int key;
  public Tree left;
  public Tree right;
  public Tree parent;

  public Tree() { }
}

