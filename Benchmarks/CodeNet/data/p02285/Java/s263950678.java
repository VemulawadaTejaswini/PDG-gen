import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    int i,n;
    Node T = null;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(buffer.readLine());
        for(i=0;i<n;i++) {
            String[] str = buffer.readLine().split(" ");
            if(str[0].equals("insert")){
                T = Node.insert(T, new Node(Integer.parseInt(str[1])));
            }else if(str[0].equals("find")){
                if(Node.find(T, Integer.parseInt(str[1]))){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }else if(str[0].equals("delete")){
                Node.delete(T, Integer.parseInt(str[1]));
            }else{
                Node.printInOrder(T);
                Node.printPreOrder(T);
            }
        }

    }
public static class Node{
    public int key;
    public Node left;
    public Node right;
    public Node p;
    public Node(int key){
        this.key = key;
    }
    public static Node insert(Node T, Node z){
        Node y = null;
        Node x = T;
        while(x!=null){
            y = x;
            if(z.key < x.key){
                x = x.left;
            }else{
                x = x.right;
            }
        }
        z.p = y;
        if(y==null){
            T = z;
        }else if(z.key < y.key){
            y.left = z;
        }else{
            y.right = z;
        }
        return T;
    }
    public static boolean find(Node T, int key){
        Node x = T;
        while(x != null){
            if(key==x.key){
                return true;
            }else if(key < x.key){
                x = x.left;
            }else{
                x = x.right;
            }
        }
        return false;
    }
    public static void delete(Node T, int key){
        Node z = T;
        while(key != z.key){
            if(key < z.key){
                z = z.left;
            }else{
                z = z.right;
            }
        }
        if(z.left == null || z.right == null){
            Node c = null;
            if(z.left!=null){
                c = z.left;
                c.p = z.p;
            }else if(z.right!=null){
                c = z.right;
                c.p = z.p;
            }
            if(z.p.left==z){
                z.p.left = c;
            }else{
                z.p.right = c;
            }
        }else{
            Node n = z.right;
            while(n.left!=null){
                n = n.left;
            }
            z.key = n.key;
            if(n.right==null){
                if(n.p.left == n){
                    n.p.left = null;
                }else{
                    n.p.right = null;
                }
            }else{
                n.p.left = n.right;
                n.right.p = n.p;
            }
        }
    }
    public static void printInOrder(Node T){
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        inOrder(T, sb);
        System.out.println(sb);
    }
    public static void inOrder(Node z, StringBuilder sb){
        if(z == null){
            return;
        }

        if(z.left!=null){
            inOrder(z.left, sb);
            sb.append(' ');
        }
        sb.append(z.key);
        if(z.right != null){
            sb.append(' ');
            inOrder(z.right, sb);
        }
    }
    public static void printPreOrder(Node T){
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        preOrder(T, sb);
        System.out.println(sb);
    }
    public static void preOrder(Node z, StringBuilder sb){
        if(z == null){
            return;
        }
        sb.append(z.key);
        if(z.left != null){
            sb.append(' ');
            preOrder(z.left, sb);
        }
        if(z.right != null){
            sb.append(' ');
            preOrder(z.right, sb);
        }
    }
}
}

