import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(), w = sc.nextInt();
        int n = sc.nextInt();
        char[][] map = new char[h+1][w+1];
        for(int i=1; i<=h; i++){
            String s = sc.next();
            for(int j=1; j<=w; j++){
                map[i][j] = s.charAt(j-1);
            }
        }

        int[][] J = new int[h+1][w+1];
        int[][] O = new int[h+1][w+1];
        int[][] I = new int[h+1][w+1];
        for(int i=1; i<=h; i++){
            for(int j=1; j<=w; j++){
                J[i][j] = J[i-1][j] + J[i][j-1] - J[i-1][j-1] + ((map[i][j]=='J')? 1 : 0);
                O[i][j] = O[i-1][j] + O[i][j-1] - O[i-1][j-1] + ((map[i][j]=='O')? 1 : 0);
                I[i][j] = I[i-1][j] + I[i][j-1] - I[i-1][j-1] + ((map[i][j]=='I')? 1 : 0);
            }
        }

        for(int i=0; i<n; i++){
            int h2 = sc.nextInt(), w2 = sc.nextInt();
            int h1 = sc.nextInt(), w1 = sc.nextInt();
            int cntJ = J[h1][w1] + J[h2-1][w2-1] - J[h1][w2-1] - J[h2-1][w1];
            int cntO = O[h1][w1] + O[h2-1][w2-1] - O[h1][w2-1] - O[h2-1][w1];
            int cntI = I[h1][w1] + I[h2-1][w2-1] - I[h1][w2-1] - I[h2-1][w1];
            System.out.println(cntJ+" "+cntO+" "+cntI);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}