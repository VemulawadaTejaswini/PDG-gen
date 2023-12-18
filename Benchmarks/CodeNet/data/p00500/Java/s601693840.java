import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] num = new int[3][101];
        int[][] player = new int[n][3];

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                int number = sc.nextInt();
                num[j][number]++;
                player[i][j] = number;
            }
        }

        int[] point = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                if(num[j][player[i][j]]==1){
                    point[i] += player[i][j];
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(point[i]);
        }

    }

    public static void main(String[] args){
        new Main().solve();
    }
}