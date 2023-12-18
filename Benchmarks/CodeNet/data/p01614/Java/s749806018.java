import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n];
        int[] l = new int[n];
        int[] p = new int[n];
        for(int i=0; i<n; i++){
            s[i] = sc.nextInt();
            l[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] w = new int[m];
        for(int i=0; i<m; i++) w[i] = sc.nextInt();

        int[] point = new int[394];
        Arrays.fill(point, -1);

        point[0] = 0;
        for(int i=0; i<394; i++){
            for(int j=0; j<n; j++){
                for(int k=s[j]; k<=l[j]; k++){
                    if(i-k<0) break;
                    if(point[i-k]!=-1) point[i]  = Math.max(point[i], point[i-k] + p[j]);
                }
            }
        }

        boolean boo = true;
        for(int i=0; i<m; i++) if(point[w[i]]==-1) boo = false;
        if(!boo) System.out.println(-1);
        else for(int i=0; i<m; i++) System.out.println(point[w[i]]);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}