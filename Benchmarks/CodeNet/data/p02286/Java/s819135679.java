import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      final int n = Integer.parseInt(br.readLine());
      String op;
      String[] words;
      Treap treap = new Treap();
      int key,p,t;

      for(int i=0,k=0; i<n; i++,k=0){
        words = br.readLine().split(" ");
        op  = words[k++];

        switch( op ) {
          case "insert" :
            key = Integer.parseInt(words[k++]);
            p   = Integer.parseInt(words[k]);
            treap.insert(key,p);
            break;
          case "find" :
            t = Integer.parseInt(words[k]);
            System.out.println( treap.find(t) ? "yes" : "no" );
            break;
          case "delete" :
            treap.delete(Integer.parseInt(words[k]));
            break;
          default :
            treap.dispRoundPath();
        }
      }

    }
    catch(IOException e) {
      System.out.println("IOException!");
    }
  }
}

class Treap {

  static final int min = Integer.MIN_VALUE;
  static final TreapNode NIL = new TreapNode(min,min);
  TreapNode root;
  StringBuilder buf;

  public Treap() {
    root = NIL;
    buf = new StringBuilder();
  }

  public void insert(int key, int priority) {
    root = insertTreap(root, key, priority);
  }
  public boolean find(int target) {
    TreapNode x = root;

    while( !x.equals(NIL) ) {
      if( target == x.key )
        return true;
      else
        x = target < x.key ? x.left : x.right;
    }

    return false;
  }
  public void delete(int target) {
    root = deleteNode(root,target);
  }
  public void dispRoundPath() {

    inParse(root);
    buf.append("\n");
    preParse(root);
    buf.append("\n");

    System.out.print(buf);
    buf.setLength(0);
  }
  private TreapNode insertTreap(TreapNode node, int key, int priority) {
    if( node.equals(NIL) ) return new TreapNode(key, priority);
    if( key == node.key ) return node;
    if( key < node.key ) {
      node.left = insertTreap(node.left, key, priority);
      if( node.priority < node.left.priority ) node = rightRotate(node);
    }
    else {
      node.right = insertTreap(node.right, key, priority);
      if( node.priority < node.right.priority ) node = leftRotate(node);
    }

    return node;
  }
  private TreapNode rightRotate(TreapNode node) {
    TreapNode t = node.left;
    node.left = t.right;
    t.right = node;
    return t;
  }
  private TreapNode leftRotate(TreapNode node) {
    TreapNode t = node.right;
    node.right = t.left;
    t.left = node;
    return t;
  }
  private TreapNode deleteNode(TreapNode node, int key) {
    if( node.equals(NIL) ) return NIL;
    if( key < node.key ) node.left = deleteNode(node.left, key);
    else if( key > node.key ) node.right = deleteNode(node.right, key);
    else return deleteNodeTP(node, key);

    return node;
  }
  private TreapNode deleteNodeTP(TreapNode node, int key) {
    if(node.left.equals(NIL) && node.right.equals(NIL)) return NIL;
    else if(node.left.equals(NIL) ) node = leftRotate(node);
    else if(node.right.equals(NIL)) node = rightRotate(node);
    else node = node.left.priority > node.right.priority ?
      rightRotate(node) : leftRotate(node);
    
    return deleteNode(node, key);
  }
  private void preParse(TreapNode u) {
    if( !u.equals(NIL) ) {
      buf.append(" ").append(u.key);
      preParse(u.left);
      preParse(u.right);
    }
  }
  private void inParse(TreapNode u) {
    if( !u.equals(NIL) ) {
      inParse(u.left);
      buf.append(" ").append(u.key);
      inParse(u.right);
    }
  }
}

class TreapNode {
  int key,priority;
  TreapNode parent,left,right;

  public TreapNode(int key, int priority) {
    this.key = key;
    this.priority = priority;
    this.parent =
    this.left =
    this.right = Treap.NIL;
  }

  @Override
  public boolean equals(Object o) {
    if(o == this) return true;
    if(o == null) return false;
    if(!(o instanceof TreapNode)) return false;

    TreapNode node = (TreapNode)o;
    if(!(this.key == node.key)) return false;

    return true;
  }
}
