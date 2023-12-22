import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A[] = new int[100];
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int flag = 1, t, minj = 0, change = 0;
        boolean dif = false;
        for(int i=0; i<=N-1; i++){
            minj = i;
            for(int j=i; j<=N-1; j++){
                if(A[j] < A[minj]){
                    minj = j;
                    dif = true;
                }
            } 
            t = A[i];
            A[i] = A[minj];
            A[minj] = t;
            if(dif){
                change++;
                dif = false;
            }
        }
        for(int j=0; j<N; j++)  {
            System.out.print(A[j]);
            if(j != N-1) System.out.print(" ");
        }
        System.out.println("\n" + change);
    }
}
