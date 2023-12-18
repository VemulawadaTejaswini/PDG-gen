
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[][] abc = new int[N][3];   //a,b,cとわけるより後の処理が楽
        for(int i=0;i<N;i++){
            for(int j=0;j<3;j++){
                abc[i][j] = sc.nextInt();
            }
        }
        int[][] happiness = new int[N][3];
        for(int j=0;j<3;j++){
            happiness[0][j] = abc[0][j];    //後のforループの中に書くことももちろんできるがifをi回踏むのが感覚的に嫌なので。
        }
        for(int i=1;i<N;i++){
            for(int j=0;j<3;j++){
                happiness[i][j] = abc[i][j] + Math.max(happiness[i-1][(j+1)%3], happiness[i-1][(j+2)%3]);
            }
        }

        System.out.println(Math.max(Math.max(happiness[N-1][0], happiness[N-1][1]), happiness[N-1][2]));
    }
}
