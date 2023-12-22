import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        boolean judge = true;

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        int A[] = new int[N];
        int sum = 0;

        for(int i=0; i<N; i++)
        {
            A[i] = Integer.parseInt(sc.next());
            sum += A[i];
        }

        Arrays.sort(A);

        for(int j=N-1; j>(N-1)-M; j--)
        {
            if(A[j]< 1.0*sum/4/M) judge = false;
        }

        if(judge) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}