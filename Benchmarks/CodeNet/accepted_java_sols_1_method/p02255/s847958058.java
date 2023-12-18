import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
 
    int i,j,k;
    int v;
    
    for(i = 0; i < N; i++){
        A[i] = sc.nextInt();
     //   System.out.print(A[i]+ " ");
    }
    

    for(k = 0; k < N; k++){
        System.out.print(A[k]);
        if(k < N-1){
            System.out.print(" ");
        }
    }
    System.out.println();

    for(i = 1; i < N; i++){

        v = A[i];
        j = i - 1;
        while(j >= 0 && A[j] > v){
            A[j+1] = A[j];
            j--;
        }
        A[j+1] = v;
        for(k = 0; k < N; k++){
            System.out.print(A[k]);
            if(k < N-1){
                System.out.print(" ");
            }
        }
        System.out.println();

    }
    
    
    
    }
}
