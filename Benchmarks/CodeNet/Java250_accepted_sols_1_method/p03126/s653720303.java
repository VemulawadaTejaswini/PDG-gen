import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            int N = scan.nextInt();
            int M = scan.nextInt()+1;
            int[][] A_ = new int[N][M];
            int[] Kind_ = new int[M];

            //初期化
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    A_[i][j] = 0;
                }
            }
            for(int i = 0; i < M; i++){
                Kind_[i] = 0;
            }

            //連想配列
            for(int i = 0; i < N; i++){
                int K = scan.nextInt();
                for(int j = 0; j < K; j++){
                    A_[i][j] = scan.nextInt();
                    Kind_[A_[i][j]]++;
                }
            }

            int count = 0;
            for(int i = 1; i < M; i++){
                if(Kind_[i] == N){
                    count++;
                }
            }
            System.out.println(count);
        }finally{
            scan.close();
        }
    }
}
