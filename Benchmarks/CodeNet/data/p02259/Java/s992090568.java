import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A[] = new int[100];
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int flag = 1, t, change = 0;
        while(flag == 1){
            flag = 0;
            for(int j=N-1; j>=1; j--){
                if(A[j] < A[j-1]){
                    t = A[j];
                    A[j] = A[j-1];
                    A[j-1] = t;
                    flag = 1;
                    change++;
                }
            }
        }
        for(int j=0; j<N; j++)  {
            System.out.print(A[j]);
            if(j != N-1) System.out.print(" ");
        }
        System.out.println("\n" + change);
    }
}
