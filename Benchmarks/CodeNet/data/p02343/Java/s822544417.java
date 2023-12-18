import java.util.*;
public class Main {
    static Node[] set;
    static public class Node{
        int id;
        int parent;
        public Node(int n){
            id = n;
            parent = n;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        set = new Node[n];
        for(int i = 0; i < n; i++){
            set[i] = new Node(i);
        }
        // 0 = unite 1 = same
        for(int i = 0; i < q; i++){
            int func = scan.nextInt();
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            if(func == 0){
                int newP = set[n1].parent;
                int changeP = set[n2].parent;
                update(newP, changeP);
            }
            else{
               if(set[n1].parent == set[n2].parent){
                   System.out.println(1);
               }
               else{
                   System.out.println(0);
               }
            }
        }

    }
   static public void update(int np, int op){
        for (int i = 0; i < set.length;i++){
            if(set[i].parent == op){
                set[i].parent = np;
            }
        }
    }
}
