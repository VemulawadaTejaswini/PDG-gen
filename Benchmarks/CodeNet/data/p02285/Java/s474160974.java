import java.io.*;
import java.util.*;
class Main{
  static Node root = null;
  static StringBuilder bl = new StringBuilder();
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String [] s = new String[2];
    for(int i = 0; i<n; i++){
      
      s = br.readLine().split("\\s+");
      
      if(s[0].charAt(0) == 'i'){
        
        Insert( Integer.parseInt(s[1]));
        
      }else if(s[0].charAt(0) == 'p'){
        
        inorder(root);
        bl.append("\n");
        preorder(root);
        bl.append("\n");
        
      }else if(s[0].charAt(0) == 'd'){
        delete(find(root, Integer.parseInt(s[1])));
        
      }else{
        
        if( find(root, Integer.parseInt(s[1])) == null){
          bl.append("no\n");
        }else{
          bl.append("yes\n");
        }
        
      }
    }
    System.out.print(bl);
  }
  
  static void Insert (int k){
    Node y = null;
    Node x = root;
    Node z = new Node();
    z.key = k;
    z.left = null;
    z.right = null;
    
    while(x != null){
      y = x;
      if(z.key < x.key){
        x = x.left;
      }else{
        x = x.right;
      }
    }
    z.parent = y;
    
    if( y == null){
      root = z;
    }else if( z.key < y.key){
      y.left = z;
    }else{
      y.right = z;
    }
  }
  
  static Node find(Node u, int k){
    while( u != null){
      if(k == u.key){
        return u;
      }
      if(k<u.key){
        u = u.left;
      }else{
        u = u.right;
      }
    }
    return null;
  }
  
  static void delete(Node u){
    Node y;
    Node x;
    if(u.left == null || u.right == null){
      y = u;
    }else{
      y = getSuccessor(u);
    }
    
    if(y.left != null){
      x = y.left;
    }else{
      x = y.right;
    }
    
    if( x != null){
      x.parent = y.parent;
    }
    
    if(y.parent == null){
      root = x;
    }else{
      if( y == y.parent.left){
        y.parent.left = x;
      }else{
        y.parent.right = x;
      }
      
      if( y !=u){
        u.key = y.key;
      }
    }
    
  }
  
  static Node getSuccessor(Node u){
    if(u.right != null){
      return getMinimum(u.right);
    }
    Node y = u.parent;
    while(y != null && u == y.right){
      u = y;
      y = y.parent;
    }
    return y;
  }
  
  static Node getMinimum(Node u){
    while(u.left !=null){
      u = u.left;
    }
    return u;
  }
  
  static void preorder(Node u){
    if( u == null) return;
    bl.append(" ").append(u.key);
    preorder(u.left);
    preorder(u.right);
  }
  
  static void inorder(Node u){
    if(u == null) return;
    inorder(u.left);
    bl.append(" ").append(u.key);
    inorder(u.right);
  }
  
}

class Node{
  int key;
  Node parent = null;
  Node right;
  Node left;
  Node(){};
}
