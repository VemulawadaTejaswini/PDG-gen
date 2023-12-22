import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int dummy;
        int count = 0;
        int minj;

        for (int i = 0; i < N; i++) {
            minj = i;

            for (int j = i; j < N; j++) {
                if(A[j] < A[minj]){
                    minj = j;
                }
            }

            
            if(i != minj){
                dummy = A[minj];
                A[minj] = A[i];
                A[i] = dummy;
    
                count++;
            }
        }        

        


        for (int i = 0; i < N; i++) {
            System.out.print(A[i]);
            if(i != N-1){
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.println(count);

        sc.close();
    }
}

