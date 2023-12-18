import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// disjoin set
public class Main {
    static class UnionFind {

        private int parent[];
        private int rank[];

        public UnionFind(int Num_element) {
            parent = new int[Num_element];
            rank = new int[Num_element];
            for (int i = 0; i < Num_element; i++)
                parent[i] = i;
        }
        public void makeSet(int x) {
            parent[x] = x;
            rank[x] = 0;
        }

        public void union(int x, int y) {
            link(findSet(x), findSet(y));
        }

        public int findSet(int x) {
            if (parent[x] != x) {
                parent[x] = findSet(parent[x]);
            }
            return parent[x];
        }


        public void link(int x, int y) {
            if (rank[x] > rank[y]) {
                parent[y] = x;
            } else {
                parent[x] = y;
                if (rank[x] == rank[y]) {
                    rank[y]++;
                }
            }
        }
        public void command(int com, int x, int y){
            if(com == 0){
               //unite
                union(x,y);
            }else{
                //same
                if( findSet(x) == findSet(y))
                    System.out.println("1");
                else
                    System.out.println("0");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Disjoin set element number
        int Num_element;

        //Query times
        int Num_query;


            Num_element = sc.nextInt();
            Num_query = sc.nextInt();
            UnionFind Disjoin_set = new UnionFind(Num_element);
            for (int i=0;i<Num_query;i++){
                // '0' denotes unite and '1' denotes same operation.
                int com = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                Disjoin_set.command(com,x,y);
            }

    }
}

