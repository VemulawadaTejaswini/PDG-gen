import java.util.*;

public class Main{
    static long val = 10000000000L;
    static int n,m,x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());
        x = Integer.parseInt(sc.next());
        int[][] a = new int[n][m];
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            c[i] = Integer.parseInt(sc.next());
            for(int j=0;j<m;j++){
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        sc.close();
        int[] u = new int[m];
        int cost = 0;
        for(int i=0;i<1<<n;i++){
            cost = 0;
            Arrays.fill(u,0);
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                    cost+=c[j];
                    for(int k=0;k<m;k++){
                        u[k]+=a[j][k];
                    }
                }
            }
            boolean flag = true;
            for(int k=0;k<m;k++){
                if(u[k]<x){
                    flag = false;
                    break;
                }
            }
            if(flag){
                val = Math.min(val,cost);
            }
        }
        if(val<10000000000L){
            System.out.println(val);
        }else{
            System.out.println(-1);
        }
        

    }
    
}