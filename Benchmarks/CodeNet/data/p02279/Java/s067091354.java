import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int id,degree;
      int[] childId;
      String[] words;
      TreeNodeA[] tree = new TreeNodeA[n];
      for (int i=0; i<n; i++) {
        tree[i] = new TreeNodeA();
      }

      for(int i=0, k=0; i<n; i++, k=0){
        words = br.readLine().split(" ");
        id     = Integer.parseInt(words[k++]);
        degree = Integer.parseInt(words[k++]);
        childId = new int[degree];

        tree[id].setId(id).setDegree(degree).setChildId(childId);

        for (int j=0,l=0; j<degree; j++) {
          childId[j] = Integer.parseInt(words[k++]);
          if( j==0 ) tree[id].setLeftChild(childId[j]);
          else tree[l].setRightSibling(childId[j]);
          l = childId[j];
          tree[childId[j]].setParent(id);
        }
      }

      int root=0;
      for (TreeNodeA node : tree)
        if(node.getParent() == TreeNodeA.NIL) root = node.getId();
      calcDepth(tree, root, 0);

      StringBuilder s = new StringBuilder();
      for (TreeNodeA node : tree) {
        s.append(node).append("\n");
      }
      System.out.print(s);
    }
    catch(IOException e) {
      System.out.println("IOException!");
    }
  }

  void calcDepth(TreeNodeA[] tree, int u, int p) {
    tree[u].setDepth(p);

    if( tree[u].getRightSibling() != TreeNodeA.NIL )
      calcDepth(tree, tree[u].getRightSibling(), p);

    if( tree[u].getLeftChild() != TreeNodeA.NIL )
      calcDepth(tree, tree[u].getLeftChild(), p+1);
  }
}

class TreeNodeA {
  static final int NIL = -1;
  private int id;
  private int degree;
  private int parent;
  private int depth;
  private int type;
  private int[] childId;
  private int leftChild;
  private int rightSibling;

  public TreeNodeA() {
    this.id = NIL;
    this.degree = NIL;
    this.parent = NIL;
    this.leftChild = NIL;
    this.rightSibling = NIL;
  }

  public int getId() {
    return id;
  }
  public int getDegree() {
    return degree;
  }
  /**
   * @return the parent
   */
  public int getParent() {
    return parent;
  }
  public int getDepth() {
    return depth;
  }
  public String getType() {
    switch(type) {
      case 0:
        return "root";
      case 1:
        return "internal node";
      default:
        return "leaf";
    }
  }
  public int getChildId(int k) {
    if(childId != null)
      return childId[k];
    else
      return NIL;
  }
  /**
   * @return the rightSibling
   */
  public int getRightSibling() {
    return rightSibling;
  }
  /**
   * @return the leftChild
   */
  public int getLeftChild() {
    return leftChild;
  }
  public TreeNodeA getNode(int id) {
    return this;
  }

  public TreeNodeA setId(int id) {
    this.id = id;
    return this;
  }
  public void setDepth(int d) {
    depth = d;
    if(depth > 0) {
      if(degree > 0)
        setType(1);
      else
        setType(2);
    }
  }
  public void setType(int t) {
    this.type = t;
  }
  /**
   * @param degree the degree to set
   */
  public TreeNodeA setDegree(int degree) {
    this.degree = degree;
    return this;
  }
  /**
   * @param parent the parent to set
   */
  public void setParent(int parent) {
    this.parent = parent;
  }
  /**
   * @param childId the childId to set
   */
  public TreeNodeA setChildId(int[] childId) {
    this.childId = childId;
    return this;
  }
  /**
   * @param rightChild the rightSibling to set
   */
  public void setRightSibling(int rightSibling) {
    this.rightSibling = rightSibling;
  }
  /**
   * @param leftSibling the leftSibling to set
   */
  public void setLeftChild(int leftChild) {
    this.leftChild = leftChild;
  }

  @Override
  public String toString() {
    return "node " + id + ": parent = " + parent + ", depth = " + depth + ", "
      + getType() +", " + Arrays.toString(childId);
  }
}
