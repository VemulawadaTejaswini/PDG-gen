import java.util.*;

public class Main {
        
    public static void main(String[] args){
        
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] ju = new boolean[n+1][n+1];
        
        for(int i=0;i<n+1;i++){
            Arrays.fill(ju[i],false);
        }
        
        ArrayList<ArrayList<Integer>> gr = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<2;i++){
            gr.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<n;i++){
            int u = sc.nextInt();
            int k = sc.nextInt();
            for(int j=0;j<k;j++){
                int v = sc.nextInt();
                ju[u][v] = true;
            }
        }
         
        int[] d = new int[n+1];
        Arrays.fill(d,-1);
        d[1] = 0;
         
        for(int i=0;i<n;i++){
            for(int k=1;k<=n;k++){
                if(d[k]==i){
                    for(int j=1;j<=n;j++){
                        if(ju[k][j] && d[j]==-1){
                            d[j] = d[k] + 1;
                        }
                    }
                }
            }
        }
         
        for(int i=1;i<=n;i++){
            System.out.println(i+" "+d[i]);
        }
    }
}