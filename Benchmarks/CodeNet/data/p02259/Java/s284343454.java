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
        int count;
        count = bubbleSort(A,N);
        for (int i = 0; i < N; i++){
            if (i == N-1){
                System.out.println(A[i]);
            } else {
                System.out.printf("%d ",A[i]);
            }
        }
        System.out.println(count);
    }
    public static int bubbleSort(int[] A, int N){
        boolean flag = true;
        int tmp,count;
        count = 0;
        while (flag){
            flag = false;
            for (int i = N-1; i > 0; i--){
                if (A[i] < A[i-1]){
                    tmp = A[i];
                    A[i] = A[i-1];
                    A[i-1] = tmp;
                    flag = true;
                    count += 1;
                }
            }
        }
        return count;
    }
}
