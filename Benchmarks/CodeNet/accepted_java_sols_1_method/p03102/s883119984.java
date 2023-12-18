import java.util.Scanner;
import java.util.Arrays;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int C = scan.nextInt();

        int B[] = new int[M];
        int A[] = new int[M];


        int total = 0;
        int count = 0;

        for(int i = 0 ; i < M; i++){
            B[i]= scan.nextInt();
        }

        for(int j = 0 ; j < N; j++){

        for(int i = 0 ; i < M; i++){
            A[i]= scan.nextInt();
            total += B[i] * A[i];
        }
        total += C;
        
        if(total > 0){
            count++;
        }
        total = 0;
        }
        System.out.println(count);
    }
}