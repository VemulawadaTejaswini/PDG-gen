import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    StringBuilder bl = new StringBuilder();
    int id,l,r,root=-1;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node [] node = new Node[n];

    for(int i = 0; i<n; i++){
      node[i] = new Node();
    }

    for(int i = 0; i<n; i++){
      id = sc.nextInt();
      l = sc.nextInt();
      r = sc.nextInt();
      node[id].left = l;
      node[id].right = r;
      if(l != -1) node[l].parent = id;
      if(r != -1) node[r].parent = id;
    }

    for(int i = 0;i<n; i++){
      if(node[i].parent==-1)root = i;
    }
    bl.append("Preorder\n");
    Pre_order(root, node,bl);
    bl.append("\nInorder\n");
    In_order(root, node, bl);
    bl.append("\nPostorder\n");
    Post_order(root, node,bl);
    System.out.println(bl);

  }
  static void Pre_order(int u, Node node[], StringBuilder bl){
    if(u==-1){
      return ;
    }
    bl.append(' ').append(u);
    Pre_order(node[u].left,node,bl);
    Pre_order(node[u].right,node,bl);

  }

  static void In_order(int u, Node node[], StringBuilder bl){
    if(u == -1){
      return;
    }
    In_order(node[u].left, node, bl);
    bl.append(' ').append(u);
    In_order(node[u].right, node,bl);
  }

  static void Post_order(int u, Node node[], StringBuilder bl){
    if(u == -1){
      return;
    }
    Post_order(node[u].left, node, bl);
    Post_order(node[u].right, node,bl);
    bl.append(' ').append(u);
  }

}

class Node{
  int parent = -1;
  int left = -1;
  int right = -1;
}
