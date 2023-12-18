import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] D = new int[N];
        long sumA = 0;
        long sumB = 0;
        long diff = 0;
        int count = 0;
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            sumA += A[i];
        }
        for(int i = 0; i < N; i++){
            B[i] = sc.nextInt();
            sumB += B[i];
            D[i] = B[i] - A[i];
            if(A[i] < B[i]){
                diff += B[i] - A[i];
                count++;
            }
        }
        sc.close();
        Arrays.sort(D);

        if(sumA < sumB){
            System.out.println(-1);
        } else {
            int idx = 0;
            while(diff > 0){
                diff += D[idx];
                count++;
                idx++;
            }
            System.out.println(count);
        }

    }
}