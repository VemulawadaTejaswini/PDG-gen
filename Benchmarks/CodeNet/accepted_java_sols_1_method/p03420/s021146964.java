import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        long sum = 0;
        if(K != 0){
        for(int b = K+1; b <= N; b++){
            int n = K;
            while(n <= N){
                if(N-n+1 >= b-K){
                    sum += (b-K);
                } else {
                    sum += N-n+1;
                }
                n += b;
            }
        }
    } else {
        sum = (long)Math.pow(N, 2);
    }
        System.out.println(sum);
    }
}