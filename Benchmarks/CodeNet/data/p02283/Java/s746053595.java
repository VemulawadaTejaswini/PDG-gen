import java.util.Scanner;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

class Node {
  Node left;
  Node right;
  int value;

  public Node (int x) {
    this.value = x;
    this.left = null;
    this.right = null;
  }

  public void insert(int x) {
    if (x < this.value) {
      if (left == null) {
        left = new Node(x);
        return;
      } else {
        left.insert(x);
        return;
      }
    } else {
      if (right == null) {
        right = new Node(x);
        return;
      } else {
        right.insert(x);
        return;
      }
    }
  }

  public void printInOrder(){
    if (left != null) {
      left.printInOrder();
    }

    process();

    if (right != null) {
      right.printInOrder();
    }
  }

  public void printPreOrder(){
    process();

    if (left != null) {
      left.printPreOrder();
    }

    if (right != null) {
      right.printPreOrder();
    }
  }


  private void process() {
    System.out.print(value);
    System.out.print(" ");
  }
}

class BinaryTree {
  Node root;

  public BinaryTree() {}

  public void insert(int x) {
    if (root == null) {
      root = new Node(x);
      return;
    }

    if (x < root.value) {
      if (root.left == null) {
        root.left = new Node(x);
        return;
      } else {
        root.left.insert(x);
        return;
      }
    } else {
      if (root.right == null) {
        root.right = new Node(x);
        return;
      } else {
        root.right.insert(x);
        return;
      }
    }
  }

  public void printInOrder() {
    if (root != null) {
      root.printInOrder();
    }
    System.out.println();
  }

  public void printPreOrder() {
    if (root != null) {
      root.printPreOrder();
    }
    System.out.println();
  }

  public void print() {
    printInOrder();
    printPreOrder();
  }
}



public class Main {
  private static int N;
  final static String INSERT = "insert";
  final static String PRINT = "print";

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    BinaryTree tree = new BinaryTree();

    for (int i = 0; i < N; i++) {
      String cmd = in.next();
      switch(cmd) {
        case INSERT:
          tree.insert(in.nextInt());
          break;
        case PRINT:
          tree.print();
          break;
        default:
          System.out.println("Error");
          System.exit(1);
      }
    }
  }
}