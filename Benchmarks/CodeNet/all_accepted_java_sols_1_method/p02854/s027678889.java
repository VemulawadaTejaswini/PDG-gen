import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long a[] = new long[N];
        for(int i=0; i<N; i++){
            a[i] = sc.nextLong();
        }
        
        long sum[] = new long[N];
        sum[0] = a[0];
        for(int i=1; i<N; i++){
            sum[i] = sum[i-1] + a[i];
        }

        long c = sum[N-1] / 2;
        int center = 0;
        long min = Long.MAX_VALUE;

        for(int i=0; i<N-1; i++){
            if(Math.abs(sum[N-1] - sum[i] - sum[i]) < min){
                center = i;
                min = sum[N-1] - sum[i] - sum[i];
            }
        }
        System.out.println(Math.abs(sum[N-1] - sum[center] - sum[center]));
    


    }
}