import java.util.*;

class Main{
    int H, N;
    int[] A, B, DP;

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        H = Integer.parseInt(scanner.next());
        N = Integer.parseInt(scanner.next());

        A = new int[N];
        B = new int[N];

        int maxA=0;
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(scanner.next());
            B[i] = Integer.parseInt(scanner.next());

            if(A[i] > maxA) maxA = A[i];
        }

        int[] DP = new int[H+maxA];
        DP[0] = 0;
        for(int i=1;i<H+maxA;i++){
            DP[i] = Integer.MAX_VALUE;
            for(int j=0;j<N;j++){
                if(i-A[j]<0){
                    DP[i] = Math.min(DP[i], B[j]);
                } else {
                    DP[i] = Math.min(DP[i], DP[i-A[j]] + B[j]);
                }
            }
        }

        int minDP = DP[H];
        for(int i=1;i<maxA;i++){
            if(minDP > DP[H+i])minDP = DP[H+i];
        }

        System.out.println(minDP);
    }
}
