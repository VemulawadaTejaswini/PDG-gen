
import java.util.Scanner;

public class Main {

    public static int MAX = 100000;
    public static Node[] node = new Node[MAX];
    public static int n;
    public static void main(String[] args) {
        // TODO Auto-generated method stu
        Scanner sc = new Scanner(System.in);
        int v,d,l;
        int c = l = -1;
        n = sc.nextInt();
        String str[];
        for(int i = 0; i < MAX;i++){
            node[i] = new Node();
            node[i].p = -1;
            node[i].r = node[i].l = -1;
        }
        
        
        for(int j = 0; j<n;j++){
            v = sc.nextInt();
            d = sc.nextInt();

            for(int i = 0;i < d;i++){
                c = sc.nextInt();
                if(i == 0){
                    node[v].l = c;
                }else{
                    node[l].r = c;
                }
                l = c;
                node[l].p = v;
            }
        }
        print();
        
    }
    
    
    public static void print(){
        String children,type;
        int c,d;
        for(int i = 0; i < n; i++){
            children = "";
            c = node[i].l;
            for(int j = 0; c != -1; j++){
                children += c;
                c = node[c].r;
                if(c!= -1) children += ", ";
            }
            if(node[i].p == -1){
                type = "root";
            }else if(node[i].l == -1){
                type = "leaf";
            }else{
                type = "internal node";
            }
            
            d = 0;
            int j =i;
            while(node[j].p != -1){
                d ++;
                j = node[j].p;
            }

            System.out.printf("node %d: parent = %d, depth = %d, %s, [%s]\n",i,node[i].p,d,type,children);
        }

    }

}

class Node{
    int p,r,l;
    public void node(){
        
    }
}

