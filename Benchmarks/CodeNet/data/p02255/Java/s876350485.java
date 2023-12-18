import java.util.Scanner;

public class Main{

   static void trace(int A[],int N){
        for (int i = 0; i<N;i++){
            if (i>0) System.out.print(" ");
            System.out.print(A[i]);
        }
        System.out.println();
    }
   static void insertionsort(int A[],int N){
        for (int i = 1; i<N;i++){
            int v =  A[i];
            int j = i-1;
            while (j>=0&&A[j]>v){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = v;
            trace(A,N);
        }
    }

    public static void main(String[]args){
        int A[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i<N; i++){
            A[i] = scanner.nextInt();
        }

        trace(A,N);
        insertionsort(A,N);
    }
}

