import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];

        long AMax = 0;
        long BMax = 0;

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            AMax += A[i];
        }

        for(int i=0; i<M; i++) {
            B[i] = sc.nextInt();
            BMax += B[i];
        }

        int result = 0;

        int Atime = K;
        int maxTime = K;
        if(Atime > AMax) {
            Atime = (int)AMax;
        }
        if(maxTime > AMax + BMax) {
            Atime = (int)AMax + (int)BMax;
        }

        for(int j=0; j<=maxTime; j++) {
            int Btime = Math.max(maxTime - Atime, 0);
            int tmpResult = 0;

            if(Atime < 0) {
                Atime = 0;
                Btime = K;
            }

            System.err.println("A:" + Atime + " B:" + Btime);

            int Aindex = 0;
            int tmpTime = 0;
            if(Aindex < N) {
                while(tmpTime+A[Aindex] <= Atime) {
                    tmpTime += A[Aindex];
                    tmpResult++;
                    Aindex++;
                    if(Aindex >= N) break;
                }
            }
            System.err.println("A:" + tmpResult);

            int Bindex = 0;
            tmpTime = 0;
            if(Bindex < M) {
                while(tmpTime+B[Bindex] <= Btime) {
                    tmpTime += B[Bindex];
                    tmpResult++;
                    Bindex++;
                    if(Bindex >= M) break;
                }
            }
            System.err.println("A+B:" + tmpResult);

            Atime--;
            result = Math.max(result, tmpResult);

            if(Btime >= K) break;
        }

        System.out.println(result);
    }
}