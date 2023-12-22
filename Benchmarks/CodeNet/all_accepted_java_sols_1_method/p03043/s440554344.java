import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        double ansers = 0;

        for(int i=1; i<=N; i++){
            int j = 0;
            int ans = i;
            while(ans < K){
                ans *= 2;
                j++;
            }
            ansers += (double)1/N*Math.pow(0.5,j);
        }
        System.out.println(ansers);
    }
}