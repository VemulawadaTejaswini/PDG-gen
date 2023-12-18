import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static node[] t;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        t = new node[n];
        for(int i = 0; i<n; i++)
            t[i] = new node();
        for(int i = 0; i<n; i++){
            final StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            final int id = Integer.parseInt(st.nextToken());
            final int left = Integer.parseInt(st.nextToken());
            final int right = Integer.parseInt(st.nextToken());
            t[id].left = left;
            t[id].right = right;
            if(left!=-1) t[left].parent = id;
            if(right!=-1) t[right].parent = id;
        }
        int root = 0;
        while(t[root].parent!=-1){
            root = t[root].parent;
        }
        sb.append("Preorder\n");
        preorder(root);
        sb.append('\n');
        sb.append("Inorder\n");
        inorder(root);
        sb.append('\n');
        sb.append("Postorder\n");
        postorder(root);
        sb.append('\n');
        System.out.print(sb);
    }
    static void preorder(int root){
        if(root==-1) return;
        sb.append(' ').append(root);
        preorder(t[root].left);
        preorder(t[root].right);
    }
    static void inorder(int root){
        if(root==-1) return;
        inorder(t[root].left);
        sb.append(' ').append(root);
        inorder(t[root].right);

    }
    static void postorder(int root){
        if(root==-1) return;
        postorder(t[root].left);
        postorder(t[root].right);
        sb.append(' ').append(root);
    }
}
class node{
    int parent;
    int left;
    int right;
    node(){
        parent = -1;
        left = -1;
        right = -1;
    }
}