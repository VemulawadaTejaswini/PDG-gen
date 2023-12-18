import java.util.Scanner;
 
public class Main {
    private static int n;
    private static int q;
    private static int[] p;
    private static int[] rank;
 
    private static boolean same(int x, int y) {
        return findSet(x) == findSet(y);
    }
 
    private static void unite(int x, int y) {
        int i = findSet(x);
        int j = findSet(y);
 
        if (i == j){
            return;
	}
        if (rank[i] > rank[j]){
            p[j] = p[i];
        }else {
            p[i] = p[j];
            if (rank[i] > rank[j]){
            rank[j]++;
            }
        }	
    }
 
    private static int findSet(int i) {
        while (i != p[i]){
            p[i] = p[p[i]];
            i = p[i];
        }
        return i;
    }
 
    private static void DisjointSet() {
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
?????????????????????  }
            }
    }
}