import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  private final static String INSERT = "insert";
  private final static String FIND = "find";
  private final static String YES = "yes";
  private final static String NO = "no";
  private static Tree ROOT = null;
  private static Tree END = null;

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String input;
    List<String> finded = new ArrayList<>(times);

    for (int i = 0; i < times; i++) {
      input = sc.next();
      if (input.equals(INSERT)) {
        insert(sc.nextInt());
      } else if (input.equals(FIND)) {
        if (find(ROOT, sc.nextInt())) {
          finded.add(YES);
        } else {
          finded.add(NO);
        }
      } else {
        for (String result : finded) {
          System.out.println(result);
        }
        finded.clear();
        createBuilderInorder(ROOT);
        System.out.println();
        createBuilderPreorder(ROOT);
        System.out.println();
      }
    }
  }

  public static void insert(int key) {
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
      ROOT = z;
    } else if (z.key < y.key) {
      y.left = z;
    } else {
      y.right = z;
    }
  }

  public static boolean find (Tree tree, int key) {
    if (tree != null) {
      if (tree.key > key) {
        return find(tree.left, key);

      } else if (tree.key < key) {
        return find(tree.right, key);

      } else {
        return true;
      }
    }

    return false;
  }

  public static void createBuilderInorder(Tree tree) {
    if (tree != null) {
      createBuilderInorder(tree.left);
      System.out.print(" ");
      System.out.print(tree.key);
      createBuilderInorder(tree.right);
    }
  }

  public static void createBuilderPreorder(Tree tree) {
    if (tree != null) {
      System.out.print(" ");
      System.out.print(tree.key);
      createBuilderPreorder(tree.left);
      createBuilderPreorder(tree.right);
    }
  }
}

class Tree {
  public int key;
  public Tree left;
  public Tree right;
  public Tree parent;

  public Tree() { }
}

