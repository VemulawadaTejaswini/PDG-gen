import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    static Node [] N;
    static boolean [] seen;
    static int [] d;
    static int [] f;
    static int counter = 1;


    static public class Node{
        int id;
        ArrayList<Integer> edges = new ArrayList<>();
        public Node(int id) {
            this.id = id;
        }
        public void add(int e){
            edges.add(e);
        }
    }

    static public void dfs(int i) {
        d[i] = counter;
        seen[i] = true;
        counter++;
        if(N[i].edges.isEmpty()){

        }
        else{

        }
        for (int j : N[i].edges) {
            if (!seen[j - 1]) {
                dfs(j - 1);
            }
        }
        counter++;
        f[i] = counter;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        N = new Node[n];
        seen = new boolean[n];
        d = new int[n];
        f = new int[n];
        for(int x = 0; x < n; x++){
            int id = scan.nextInt();
            N[x] = new Node(id);
            int ed = scan.nextInt();
            for(int y = 0; y < ed; y++){
                int check = scan.nextInt();
                N[x].add(check);
            }
        }
        dfs(0);
        for(int x = 0; x < n; x++){
            System.out.println(N[x].id + " " + d[x] + " " + (f[x] - 1));
        }
    }

}
