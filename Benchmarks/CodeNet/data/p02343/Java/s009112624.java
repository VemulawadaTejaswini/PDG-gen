import java.util.Scanner;
  
public class Main {
    public static int n;
    public static int q;
    public static int[] p;
    public static int[] rank;
  
    public static boolean same(int x, int y) {
        return findSet(x) == findSet(y);
    }
  
    public static void unite(int x, int y) {
        int i = findSet(x);
        int j = findSet(y);
  
        if (i == j){
        return;
    }
        if (rank[i] > rank[j]){
            p[j] = i;
        }
        else {
            p[i] = j;
            if(rank[i] == rank[j]){
            rank[j]++;
            }
        }   
    }
  
    public static int findSet(int i) {
       if(p[i] == i){ 
           return i;
        }else{
          return p[i] = findSet(p[i]);
        }
    }
  
    public static void DisjointSet() {
        p = new int[n];
        rank = new int[n];
  
        for (int i = 0; i < n; i++) {
            p[i] = i;
            rank[i] = 0;
        }
    }
  
  
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        q = scanner.nextInt();
  
        DisjointSet();
        for (int i = 0; i < q; i++) {
            int com = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
  
            if (com == 0){
                unite(x, y);
            }
            if (com == 1){
                if (same(x, y)){
                    System.out.println(1);
                }else{
                    System.out.println(0);
        }
            }
        }
    }
}