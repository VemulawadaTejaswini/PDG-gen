import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int count = SelectionSort(A, N);
        for(int i = 0; i < N; i++){
            if(i != N - 1){
                System.out.print(A[i] + " ");
            }else{
                System.out.print(A[i]);
            }
        }
        System.out.println("");
        System.out.println(count);
    }

    public static int SelectionSort(int[] a, int n){
        int c = 0;
        for(int i = 0; i <= n - 1; i++){
            int minj = i;
            for(int j = i; j <= n - 1; j++){
                if(a[j] < a[minj]){
                    minj = j;
                }
            }
            if(i != minj){
                int x = a[i];
                a[i] = a[minj];
                a[minj] = x;
                c++;
            }
        }
        return c;
    }
}
