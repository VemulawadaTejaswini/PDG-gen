


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    static List<Integer> nList = new ArrayList<>();
    static List<Integer> rankList = new ArrayList<>();

    static int[] p;
    static int[] rank;

    public static void main(String args[]){


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int q = Integer.parseInt(scanner.next());

        p = new int[n];
        rank = new int[n];

        int query;
        int x;
        int y;



        for(int i = 0; i < n; i++){
           p[i] = i;
           rank[i] = 0;
        }

        for(int i = 0; i < q; i++){
           query = Integer.parseInt(scanner.next());
           x = Integer.parseInt(scanner.next());
           y = Integer.parseInt(scanner.next());

           if(query == 0){
               union(x, y);
           }else {
               same(x, y);
           }

        }



    }


    static public void link(int x, int y){
        if(rank[x] > rank[y]){
            p[y] = x;
        }else {
            p[x] = y;
        }
        if(rank[x] == rank[y]){
            rank[y] = rank[y] + 1;
        }
    }

    static public int findSet(int x){
        if(x != p[x]){
            p[x] = findSet(p[x]);
        }
        return p[x];
    }

    static public void union(int x, int y){
        link(findSet(x), findSet(y));
            }

    static public void same(int x, int y){
        if(findSet(x) == findSet(y)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }


}

