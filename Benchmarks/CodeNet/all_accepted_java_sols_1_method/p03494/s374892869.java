import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N]; 
        int count = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextLong();
        }

        int j=0;
        while(A[j]%2==0){
            A[j] /=2;
            if(j==N-1){
            count++;
            j=0;
            continue;
            }     
            j++;
        }

        System.out.println(count);

        }
    }    



