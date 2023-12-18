import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++)
            A[i] = sc.nextInt();


        int index;
        for(index = 0; index < N - 1; index++)
            System.out.print(A[index] + " ");
        System.out.println(A[index]);

        for(int i = 1; i < N; i++){
            int v = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > v){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;

            for(index = 0; index < N - 1; index++)
                System.out.print(A[index] + " ");
            System.out.println(A[index]);
        }

    }
}

