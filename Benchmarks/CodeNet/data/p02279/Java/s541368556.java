import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static node[] t;
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        t = new node[n];
        for(int i = 0; i<n; i++)
            t[i] = new node();

        for(int i = 0; i<n; i++){
            final StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            final int id = Integer.parseInt(st.nextToken());
            final int m = Integer.parseInt(st.nextToken());
            int c0 = id;
            for(int j = 0; j<m; j++){
                final int c = Integer.parseInt(st.nextToken());
                t[c].parent = id;
                if(j==0) t[id].child = c;
                else t[c0].sibling = c;
                c0 = c;
            }
        }
        int root = 0;
        while(t[root].parent!=-1)
            root = t[root].parent;
        setdepth(root, 0);
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            sb.append("node ").append(i);
            sb.append(": parent = ").append(t[i].parent);
            sb.append(", depth = ").append(t[i].depth);
            if(t[i].parent==-1) sb.append(", root, [");
            else if(t[i].child==-1) sb.append(", leaf, [");
            else sb.append(", internal node, [");
            final int c = t[i].child;
            if(c!=-1){
                sb.append(c);
                int ch = c;
                while(true){
                    ch = t[ch].sibling;
                    if(ch==-1) break;
                    sb.append(", ").append(ch);
                }
            }
            sb.append("]\n");
        }
        System.out.print(sb);
    }
    static void setdepth(int root, int d){
        int n = root;
        do{
            t[n].depth = d;
            if(t[n].child!=-1){
                setdepth(t[n].child, d+1);
            }
            n = t[n].sibling;
        }while(n!=-1);
    }
}

class node{
    int parent;
    int child;
    int sibling;
    int depth;
    node(){
        parent = -1;
        child = -1;
        sibling = -1;
        depth = -1;
    }
}