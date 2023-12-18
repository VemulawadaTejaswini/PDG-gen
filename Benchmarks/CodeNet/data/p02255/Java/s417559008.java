import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = input.nextInt();
        }
        insertionSort(A,N);
    }
    public static void insertionSort(int[] A,int N){
        int v,j;
        for (int k = 0; k < N; k++){
                if (k != N-1){
                    System.out.printf("%d ",A[k]);
                } else {
                    System.out.println(A[k]);
                }
            }
        for (int i = 1; i < N; i++){
            v = A[i];
            j = i - 1;
            while(j >= 0 && A[j] > v){
                A[j+1] = A[j];
                j -= 1;
            }
            A[j+1] = v;
            for (int k = 0; k < N; k++){
                if (k != N-1){
                    System.out.printf("%d ",A[k]);
                } else {
                    System.out.println(A[k]);
                }
            }
        }
    }
}
