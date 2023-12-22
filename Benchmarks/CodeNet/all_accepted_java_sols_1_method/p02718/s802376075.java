import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for(int n=0; n<N; n++) A[n]=sc.nextInt();

        int totalVote = 0;
        for(int n=0; n<N; n++) totalVote += A[n];

        int popular = 0;
        for(int n=0; n<N; n++) if(A[n]*4*M >= totalVote) popular++;
        System.out.println(popular>=M ? "Yes" : "No");
    }
}
