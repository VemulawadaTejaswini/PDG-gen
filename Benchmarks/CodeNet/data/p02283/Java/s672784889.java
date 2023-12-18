import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static Node root;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            if(input.length == 2){
                insert(Integer.parseInt(input[1]));
            }else{
                inorder(root);
                System.out.println("");
                preorder(root);
                System.out.println("");
            }
        }
    }

    public static void insert(int key){
        Node x_parent = null;
        Node x = root;
        Node z = new Node(key);

        while(x != null){//x???null????????????????????????????????????????????????                  
            x_parent = x;
            if(z.key < x.key){
                x = x.left;
            }else{
                x = x.right;
            }
        }
        z.parent = x_parent;
//?????????????????\                                                              
        if(x_parent == null){
            root = z;
        }else{
            if(z.key < x_parent.key){
                x_parent.left = z;
            }else{
                x_parent.right = z;
            }
        }
    }

    public static void inorder(Node node){
        if(node == null)return;
        inorder(node.left);
        System.out.print(" " + node.key);
        inorder(node.right);
    }

    public static void preorder(Node node){
        if(node == null)return;
        System.out.print(" " + node.key);
        preorder(node.left);
        preorder(node.right);
    }


}

class Node{
    int key;
    Node right, left, parent;

    Node(int key){
        this.key = key;
        this.right = null; this.left = null; this.parent = null;
    }
}