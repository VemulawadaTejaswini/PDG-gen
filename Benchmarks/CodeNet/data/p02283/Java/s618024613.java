import java.util.Scanner;
  
class Node {
    static Node root;
  
    int key;
    Node left;
    Node right;
  
    Node(int key) {
        this.key = key;
    }
  
    void insert() {
        Node y = null;
        Node x = root;
        while(x != null) {
            y = x;
            if(key < x.key) x = x.left;
            else x = x.right;
        }
  
        if(y == null) root = this;
        else if(key < y.key) y.left = this;
        else y.right = this;
    }
  
    static String inorder(Node x) {
        String str = "";
        if(x == null) return str;
  
        if(x.left != null) str += inorder(x.left);
        str += " " + x.key;
        if(x.right != null)str += inorder(x.right);
  
        return str;
    }
  
    static String preorder(Node x) {
        String str = "";
        if(x == null) return str;
  
        str += " " + x.key;
        if(x.left != null) str += preorder(x.left);
        if(x.right != null) str += preorder(x.right);
  
        return str;
    }
}
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        Node.root = null;
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            String cmd = sc.next();
            if(cmd.equals("insert")) {
                new Node(sc.nextInt()).insert();
            }else {
                System.out.println(Node.inorder(Node.root));
                System.out.println(Node.preorder(Node.root));
            }
        }
  
        sc.close();
    }
}
