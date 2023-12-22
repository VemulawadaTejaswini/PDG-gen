import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] P = new int[N];

        for(int i=0;i<N;i++){
            P[i] = scanner.nextInt();
        }

        int M=0;
        for(int i=0;i<K;i++){
            M += P[i];
        }

        int S = M;
        for(int i=K;i<N;i++){
            S += P[i] - P[i-K];
            if(M < S){
                M = S;
            }
        }

        double R = ((double)(M + K)) / 2.0;
        System.out.println(R);
    }
}
