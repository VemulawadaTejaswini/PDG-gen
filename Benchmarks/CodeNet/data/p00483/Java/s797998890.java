import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(), w = sc.nextInt();
        int k = sc.nextInt();

        char[][] map = new char[h][w];
        for(int i=0; i<h; i++) map[i] = sc.next().toCharArray();

        int[][] J = new int[h+1][w+1];
        int[][] O = new int[h+1][w+1];
        int[][] I = new int[h+1][w+1];
        for(int i=1; i<=h; i++){
            for(int j=1; j<=w; j++){
                if(map[i-1][j-1]=='J') J[i][j]++;
                if(map[i-1][j-1]=='O') O[i][j]++;
                if(map[i-1][j-1]=='I') I[i][j]++;
                J[i][j] = J[i][j] + J[i-1][j] + J[i][j-1] - J[i-1][j-1];
                O[i][j] = O[i][j] + O[i-1][j] + O[i][j-1] - O[i-1][j-1];
                I[i][j] = I[i][j] + I[i-1][j] + I[i][j-1] - I[i-1][j-1];
            }
        }

        for(int i=0; i<k; i++){
            int y1 = sc.nextInt(), x1 = sc.nextInt();
            int y2 = sc.nextInt(), x2 = sc.nextInt();

            int n1 = J[y2][x2] - J[y2][x1-1] - J[y1-1][x2] + J[y1-1][x1-1];
            int n2 = O[y2][x2] - O[y2][x1-1] - O[y1-1][x2] + O[y1-1][x1-1];
            int n3 = I[y2][x2] - I[y2][x1-1] - I[y1-1][x2] + I[y1-1][x1-1];
            System.out.println(n1+" "+n2+" "+n3);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}