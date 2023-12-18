import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int[] B = new int[N-1];
        for(int i = 0; i < N-1; i++){
            B[i] = sc.nextInt();
        }
        sc.close();
        long sum = 0;
        for(int i = 0; i < N; i++){
            if(i == 0)
                sum += B[i];
            else if(i != N-1) {
                sum += Math.min(B[i], B[i-1]);
            } else {
                sum += B[i-1];
            }
        }

        System.out.println(sum);
    }
}