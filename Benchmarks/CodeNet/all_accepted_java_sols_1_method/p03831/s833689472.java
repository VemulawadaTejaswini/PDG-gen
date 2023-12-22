import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long[] x = new long[N];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextLong();
        }
        sc.close();

        long sum = 0;

        for(int i = 0; i < N-1; i++){
           sum += Math.min(B, (x[i+1]-x[i])*A);
        }

        System.out.println(sum);
    }
}