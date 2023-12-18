import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        int i, j, k, l;
        int N = sc.nextInt();
        int A[] = new int[N];
        
        for(i = 0; i < N; i++){
            j = sc.nextInt();
            A[i] =j;
        }
 
        for(i = 1; i <= N - 1; i++){
            for(k = 0; k < N; k++){
                System.out.print(A[k]);
                
                if(k != N - 1) System.out.print(" ");
            }
            
            System.out.println();
            l = A[i];
            j = i - 1;
            while(j >= 0 && A[j] > l){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = l;   
        }
        for(k = 0; k < N; k++){
            System.out.print(A[k]);
            if( k != N - 1) System.out.print(" ");
        }
        System.out.println();
    }
}

