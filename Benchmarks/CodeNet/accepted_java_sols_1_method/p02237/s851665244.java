import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int adj [][] = new int[n][n];
        for(int i=0;i<n;i++) Arrays.fill(adj[i],0);
        for(int i=0;i<n;i++){
            int u = sc.nextInt();
            int k = sc.nextInt();
            for(int j=0;j<k;j++){
                int num = sc.nextInt();
                adj[u-1][num-1]=1;
            }
        }
        for(int [] L:adj){
            System.out.print(L[0]);
            for(int i=1;i<n;i++) System.out.print(" "+L[i]);
            System.out.println();
        }
    }
}
