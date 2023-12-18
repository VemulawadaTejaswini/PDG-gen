import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i=0; i<n; i++){
      switch (sc.next()){
        case "insert":
          Node.insert(sc.nextInt());
          break;
        case "print":
          Node.print();
          break;
        case "find":
          System.out.println(Node.find(sc.nextInt())?"yes":"no");
          break;
      }
    }
  }
}

class Node{
  private int key;
  private Node p;
  private int k=0;
  private Node l;
  private Node r;
  private static Node root;

  public void pre(){
    System.out.print(" "+key);
    if (l!=null) l.pre();
    if (r!=null) r.pre();
  }

  public void in(){
    if (l!=null) l.in();
    System.out.print(" "+key);
    if (r!=null) r.in();
  }

  public void post(){
    if (l!=null) l.post();
    if (r!=null) r.post();
    System.out.print(" "+key);
  }

  private Node(int key, Node l, Node r){
    this.key = key;
    this.l = l;
    this.r = r;
  }

  public static void insert(int v){
    insert(new Node(v,null,null));
  }

  private static void insert(Node z){
    Node y = null;
    Node x = root;
    while (x != null){
      y = x;
      if (z.key < x.key){
        x = x.l;
      } else {
        x = x.r;
      }
    }
    z.p = y;
    if (y==null){
      root = z;
    } else if (z.key<y.key){
      y.l = z;
    } else {
      y.r = z;
    }
  }

  public static boolean find(int k){
    Node x = root;
    while (x != null){
      if (k == x.key) return true;
      else if (k < x.key){
        x = x.l;
      } else {
        x = x.r;
      }
    }
    return false;
  }

  public static void print(){
    root.in();
    System.out.println();
    root.pre();
    System.out.println();
  }
}
