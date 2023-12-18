import java.io.*;
public class Main {
        static NODE node;
        static NODE root;
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
                int n=Integer.parseInt(br.readLine());
                
                for(int i=0;i<n;i++){
                        String[] str=br.readLine().split(" ");
                
                        if("print".equals(str[0])) {
                                inorder(root);
                                System.out.println(""); 
                                preorder(root);
                                System.out.println(""); 
                        }
                        else if("insert".equals(str[0])){
                                int key=Integer.parseInt(str[1]);
                                NODE newnode=new NODE();
                                newnode.key=key;
                                insert(newnode);
                        }

                }
        }

        static void inorder(NODE node){
                if(node==null) return;
                inorder(node.left);
                System.out.print(" " + node.key);
                inorder(node.right);
        }
        
        static void preorder(NODE node){                
                if(node==null) return;
                System.out.print(" " + node.key);
                preorder(node.left);
                preorder(node.right);   
        }
        
        static void insert(NODE node){
        if(root==null){
            root = node;
            return;
        }
        NODE tnode = root;
        NODE parent = null;
        while(tnode != null) {
            parent = tnode;
            if(tnode.key > node.key)
                tnode = tnode.left;
            else
                tnode = tnode.right;
        }
        if(parent.key > node.key)
            parent.left = node;
        else
            parent.right = node;
                
        }
}

class NODE{
        int key;
        NODE left;
        NODE right;;
        NODE(){
                key=-1;
                left=null;
                right=null;
        }