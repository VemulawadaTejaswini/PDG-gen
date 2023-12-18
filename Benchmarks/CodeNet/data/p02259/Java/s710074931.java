import java.util.*;

public class Main {
    static int bubblesort(int a[], int size){
        int tmp;
        int time = 0;
        for(int i = 0; i < size-1; i++){
            for(int j = size-1; j>i; j--){
                if(a[j-1] > a[j]){
                    tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                    time++;
                }
            }
        }
        return time;
    }
    
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int time = bubblesort(A, N);
        for(int i = 0; i<N; i++){
            System.out.printf("%d", A[i]);
            if(i < N-1) System.out.printf(" ");
        }
        System.out.printf("\n%d\n", time);
        sc.close();
    }
    
}
