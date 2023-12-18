import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt();
            if(n==0 && m==0 && a==0) break;

            int[][] amida = new int[1001][n+1];

            for(int i=0; i<m; i++){
                int h = sc.nextInt(), p = sc.nextInt(), q = sc.nextInt();
                amida[h][p] = q;
                amida[h][q] = p;
            }

            int idx = a;
            for(int i=1000; i>0; i--){
                if(amida[i][idx]!=0) idx = amida[i][idx];
            }
            
            System.out.println(idx);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}