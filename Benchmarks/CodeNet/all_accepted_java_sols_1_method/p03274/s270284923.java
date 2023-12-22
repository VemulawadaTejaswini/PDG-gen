import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] X = new int[N];
        int ans = 1_000_000_000;
        for(int i = 0; i < N; i++){
            X[i] = sc.nextInt();
            int t = 1_000_000_000;
            if(i + 1 >= K){
                if(X[i] <= 0){
                    t = -X[i-K+1];
                }else if(X[i-K+1] < 0 && X[i] > 0){
                    if(-X[i-K+1] < X[i]) t = X[i] - (2*X[i-K+1]);
                    else t = -X[i-K+1] + (2*X[i]);
                }else if(X[i-K+1] >= 0){
                    t = X[i];
                }
            }
            if(t < ans) ans = t;
        }
        sc.close();
        System.out.println(ans);

    }

}
