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
      int id,degree,max=0;
      int[] child;
      String[] words;
      TreeNode[] tree = new TreeNode[n];

      for(int i=0, k=0; i<n; i++, k=0){
        words = br.readLine().split(" ");
        id     = Integer.parseInt(words[k++]);
        degree = Integer.parseInt(words[k++]);
        if(id > max) max = id;
        child = new int[degree];
        for (int j=0; j<degree; j++)
          child[j] = Integer.parseInt(words[k++]);

        tree[i] = new TreeNode(id, TreeNode.NIL, degree, child);
      }
      TreeNode[] processedTree = new TreeNode[max+1];
      for (TreeNode raw : tree) {
        processedTree[raw.getId()] = raw;
      }
      TreeNode childNode;
      int childId;
      for (TreeNode node : processedTree) {
        if(node.getDegree()>0) {
          for(int i=0; i<node.getDegree(); i++){
            if((childId = node.getChildId(i)) != TreeNode.NIL ) {
              childNode = processedTree[childId];
              childNode.setParent(node.getId());
              childNode.setDepth(node.getDepth()+1);
            }
          }
        }
      }

      for (TreeNode node : processedTree) {
        System.out.println(node);
      }
    }
    catch(IOException e) {
      System.out.println("IOException!");
    }
  }
}

class TreeNode {
  static final int NIL = -1;
  private final int id;
  private int degree;
  private int parent;
  private int depth;
  private int type;
  private int[] childId;
  private TreeNode parentNode;
  private TreeNode leftNode;
  private TreeNode rightNode;
  private TreeNode[] childNodes;

  public TreeNode(int id, int parent, int degree, int[] childId){
    this.id = id;
    this.parent = parent;
    this.degree = degree;
    this.childId = childId;
    childNodes = new TreeNode[degree];
  }

  public int getId() {
    return id;
  }
  public int getDegree() {
    return degree;
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
  public TreeNode getNode(int id) {
    return this;
  }

  public void setParent(int id) {
    this.parent = id; 
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

  @Override
  public String toString() {
    return "node " + id + ": parent = " + parent + ", depht = " + depth + ", "
      + getType() +", " + Arrays.toString(childId);
  }
}
