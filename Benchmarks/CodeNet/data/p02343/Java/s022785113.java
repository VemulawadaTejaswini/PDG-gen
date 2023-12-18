import java.util.*;
import java.io.*;

class Node{
    int id;
    Node parent=this;
    int rank;

    public Node(){}
    public Node(int id){
        this.id=id;
    }

    public Node findRoot(){
        Node root =this;
        while(true){
            if(root==root.parent){
                break;
            }
            root=root.parent;
        }
        return root;
    }
}

// class Tree{
//     int rank;
//     Node root;

//     public Tree(int rank,Node root){
//         this.rank=rank;
//         this.root=root;
//     }
// }

public class Main{
    static int INFTY = Integer.MAX_VALUE;
        
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
    //    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    try{
    //        int n = Integer.parseInt(br.readLine());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        Node[] nodes = new Node[n];
       // Tree[] tree = new Tree[n];

        for(int i=0;i<n;i++){
            nodes[i]=new Node(i);
         //   tree[i]=new Tree(1,nodes[i]);
        }


        for(int i=0;i<q;i++){
            int command =sc.nextInt();
            int u1=sc.nextInt();
            int u2=sc.nextInt();

            if(command==0){
                unite(nodes[u1],nodes[u2]);
            }
            if(command==1){
                find(nodes[u1],nodes[u2]);
            }
        }
        
    }

    public static void unite(Node u1,Node u2){
        Node root1=u1.findRoot();
        Node root2=u2.findRoot();
        if(root1==root2){
            return;
        }
        if(root1.rank>root2.rank){
            root2.parent=root1;
        }else if(root1.rank<root2.rank){
            root1.parent=root2;
        }else{
            root2.parent=root1;
            root1.rank++;
        }
    }

    public static void find(Node u1,Node u2){
        Node root1=u1.findRoot();
        Node root2=u2.findRoot();
        if(root1==root2){
            System.out.println(1);;
        }else{
            System.out.println(0);
        }
    }
    
}


    
