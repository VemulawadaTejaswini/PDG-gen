import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int A[] = new int[N];
        for(int i=0; i < N; i++){
            A[i] = n.nextInt();
        }
        for(int i=0; i < N; i++){
            System.out.print(A[i]);
            if(i==N-1){
                System.out.println("");
            }
            else{
                System.out.print(" ");
            }
        }
        for(int i = 1; i <= N-1 ; i++){
            int v = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > v){
                A[j+1] = A[j];
                j--;
                A[j+1] = v;
            }
            for(int k=0; k<N; k++){
                System.out.print(A[k]);
                if(k == N-1){
                    System.out.println("");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    }
}
