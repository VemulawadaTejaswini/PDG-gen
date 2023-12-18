import java.util.Scanner;
public class Main{
    public static void pre(Node nodes[], int root){
        System.out.print(" " + root);
        if(nodes[root].left != null)
            pre(nodes,nodes[root].left.index);
        if(nodes[root].right != null)
            pre(nodes,nodes[root].right.index);
    }
    public static void in(Node nodes[], int root){
        if(nodes[root].left != null)
            in(nodes,nodes[root].left.index);
        System.out.print(" " + root);
        if(nodes[root].right != null)
            in(nodes,nodes[root].right.index);
    }
    public static void post(Node nodes[], int root){
        if(nodes[root].left != null)
            post(nodes,nodes[root].left.index);
        if(nodes[root].right != null)
            post(nodes,nodes[root].right.index);
        System.out.print(" " + root);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root = 0;
        Node nodes[] = new Node[n];
        for(int i = 0 ; i < n ; i++)
            nodes[i] = new Node(i);
        for(int i = 0 ; i < n ; i++){
            int index = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l != -1)
                nodes[index].left = nodes[l];
            if(r != -1)
                nodes[index].right = nodes[r];
        }
        for(int i = 0 ; i < n ; i++){
            if(nodes[i].right != null)
                nodes[i].right.parent = nodes[i];
            if(nodes[i].left != null)
                nodes[i].left.parent = nodes[i];
        }
        for(int i = 0 ; i < n ; i++){
            if(nodes[i].parent == null)
                root = i;
        }        
        System.out.println("Preorder");
        pre(nodes,root);
        System.out.println();
        System.out.println("Inorder");
        in(nodes,root);
        System.out.println();
        System.out.println("Postorder");
        post(nodes,root);
        System.out.println();
    }
}
class Node{
    int index;
    Node parent = null;
    Node left = null;
    Node right = null;
    int get_parent(){
        if(parent == null)
            return -1;
        else
            return parent.index;
    }
    int sibling(){
        if(parent == null)
            return -1;
        else{
            if(parent.right == null || parent.left == null)
                return -1;
            else{
                if(parent.right.index == this.index)
                    return parent.left.index;
                else
                    return parent.right.index;
            }
        }
    }
    Node(int index){
        this.index = index;
    }
}
