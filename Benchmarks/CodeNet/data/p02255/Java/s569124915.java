
import java.util.*;
public class Main {
    public static void main(String[] args){
        //??\???
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[100];
        for(int i=0;i<N;i++) {
            A[i] =sc.nextInt();
        }
        // ??????
        trace(A, N);
        insertionSort(A, N);
    }

    public static void trace(int[] A, int N){
        for(int i = 0; i < N; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(A[i]);
        }
        System.out.println();
    }

    public static void insertionSort(int[] A, int N){
        for(int i=1;i<N;i++){
            int v=A[i];
            int j=i-1;
            while(j>=0 && A[j]>v){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=v;
            trace(A, N);
        }
    }
}