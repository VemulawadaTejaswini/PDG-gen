import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            B[i] = A[i];
        }
        sc.close();

        Arrays.sort(B);
        int count = 0;
        for(int i = 0; i < N; i+=2){
            if(Arrays.binarySearch(B, A[i])%2 == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}