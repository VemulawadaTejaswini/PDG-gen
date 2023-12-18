import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int INF = 1 << 30;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String line[] = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            if(n==0){break;}

            int[][][] stone = new int[10][n][2];
            int[][][] table = new int[10][n][m+1];
            for(int i=0; i<10; i++){
                for(int j=1; j<n; j++){
                    for(int k=0; k<=m; k++){
                        table[i][j][k] = INF;
                    }
                }
            }
            if(m > 0){
                for(int i=0; i<10; i++){
                    table[i][1][1] = 0;
                }
            }

            for (int i=0; i<n; i++){
                String info[] = br.readLine().split(" ");
                int num = Integer.parseInt(info[0]);
                for(int j=0; j<num; j++){
                    stone[j][i][0] = Integer.parseInt(info[2*j+1]);
                    stone[j][i][1] = Integer.parseInt(info[2*j+2]);
                }
            }

            for(int k=0; k<=m; k++){
                for(int j=1; j<n; j++){
                    for(int i=0; i<10; i++){
                        if(stone[i][j][0] != 0 || j==n){
                            for(int l=0; l<10; l++){
                                if(stone[l][j-1][0] != 0){
                                    table[i][j][k] = Math.min(table[i][j][k], ((stone[i][j][1]+stone[l][j-1][1]) * Math.abs(stone[i][j][0]-stone[l][j-1][0])+ table[l][j-1][k]));
                                }
                                if(j>1 && k>0){
                                    if(stone[l][j-2][0] != 0){
                                        table[i][j][k] = Math.min(table[i][j][k], ((stone[i][j][1]+stone[l][j-2][1]) * Math.abs(stone[i][j][0]-stone[l][j-2][0]) + table[l][j-2][k-1]));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int answer = INF;
            for(int i=0; i<10; i++){
                for(int k=0; k<=m; k++){
                    if(table[i][n-1][k] != 0){
                        answer = Math.min(answer,table[i][n-1][k]);
                    }
                }
            }
            System.out.println(answer);
        }
    }
}