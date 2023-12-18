import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int p;
        double[] B = new double[N];
        double[] S = new double[N];
        for(int i=0;i<N;i++){
            p = sc.nextInt();
            B[i] = (double)(1+p)/(double)2;
            if(i == 0){
                S[i] = B[i];
            }else {
                S[i] = S[i - 1] + B[i];
            }
        }
        double res;
        double maxRet = 0;
        for(int i=K-1; i<N;i++){
            if(i == K-1){
                res = S[i];
            }else{
                res = S[i] - S[i-K];
            }
            maxRet = Math.max(res, maxRet);
        }
        System.out.println(maxRet);

    }
}