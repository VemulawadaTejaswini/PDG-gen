import java.util.*;

public class Main{
    static int n;
    static int[] A;
    static int[] B;
    static int[] C;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n];
        B = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        CountingSort();
        for(int i=0; i<n-1; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println(B[n-1]);
    }
    public static void CountingSort(){
        C = new int[10001];
        for(int i=0; i<10001; i++){
            C[i] = 0;
        }
        for(int j=0; j<n; j++){
            C[A[j]]++;
        }
        for(int i=1; i<10001; i++){
            C[i] = C[i] + C[i-1];
        }
        for(int j=n-1; j>=0; j--){
            B[C[A[j]]-1] = A[j];
            C[A[j]]--;
        }
    }
}
