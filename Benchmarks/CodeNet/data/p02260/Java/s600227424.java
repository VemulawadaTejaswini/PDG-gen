import java.util.Scanner;

public class Main {

    static int selectionSort(int A[],int N){
        int count = 0;
        for (int i = 0; i<N-1;i++){
            int minj = i;
            for (int j = i;j<N;j++){
                if (A[j]<A[minj])
                {
                    minj = j;
                }
            }
            int temp = A[i];
            A[i] = A[minj];
            A[minj] = temp;
            if (i!= minj){ count++;}
        }
        return count;
    }


    public static void main(String[]args){
       int A[] = new int[100];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i<N; i++){
            A[i] = scanner.nextInt();
        }
        count = selectionSort(A,N);

        for (int i = 0; i<N; i++){
            if (i>0){
                System.out.print(" ");
            }
            System.out.print(A[i]);
        }
        System.out.println();
        System.out.println(count);
    }
}

