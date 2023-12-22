import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] A = new int[N+1];
        for(int i = 1 ; i < N ; i++)
        {
            A[sc.nextInt()]++;
        }
        for(int i = 1 ; i <= N ; i++)
        {
            System.out.println(A[i]);
        }


    }
}
