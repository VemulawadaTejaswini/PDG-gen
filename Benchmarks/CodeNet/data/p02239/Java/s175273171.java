import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    static Node [] N;
    static boolean [] seen;
    static int [] d;


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

    static public void bfs(int i, int counter) {
        if(d[i] == 0 || d[i] > counter ) {
            d[i] = counter;
            counter++;
            if (N[i].edges.isEmpty()) {

            } else {
                for (int j : N[i].edges) {
                    bfs(j - 1, counter);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        N = new Node[n];
        seen = new boolean[n];
        d = new int[n];
        for(int x = 0; x < n; x++){
            int id = scan.nextInt();
            N[x] = new Node(id);
            int ed = scan.nextInt();
            for(int y = 0; y < ed; y++){
                int check = scan.nextInt();
                N[x].add(check);
            }
        }
        bfs(0, 0);
        for(int x = 0; x < n; x++){
            if(d[x] != 0 || x == 0) {
                System.out.println(N[x].id + " " + d[x]);
            }
            else{
                System.out.println(N[x].id +" -1");
            }
        }
    }

}

