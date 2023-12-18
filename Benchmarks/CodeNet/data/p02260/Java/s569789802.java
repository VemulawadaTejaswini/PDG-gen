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
        int count = selectionSort(A,N);
        for (int i = 0; i < N; i++){
            if (i == N-1){
                System.out.println(A[i]);
            } else {
                System.out.printf("%d ",A[i]);
            }
        }
        System.out.println(count);
    }
    public static int selectionSort(int[] A,int N){
        int minj,count,tmp;
        count = 0;
        for (int i = 0; i < N; i++){
            minj = i;
            for (int j = i; j < N; j++){
                if (A[j] < A[minj]){
                    minj = j;
                }
            }
            if (A[i] != A[minj]){
                tmp = A[i];
                A[i] = A[minj];
                A[minj] = tmp;
                count += 1;
            }
        }
        return count;
    }
}
