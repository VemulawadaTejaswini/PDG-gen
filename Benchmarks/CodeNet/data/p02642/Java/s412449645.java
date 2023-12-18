import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = Integer.parseInt(scanner.next());
        var A = new int[N];
        var isP = new boolean[N];

        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(scanner.next());
            isP[i] = true;
        }

        Arrays.parallelSort(A);
        int numP = 0;

        for(int i=0; i<N; i++) {
            if(!isP[i]) continue;
            int multiply = A[i];

            for(int j=i+1; j<N; j++) {
                if(A[i] == A[j]) {
                    isP[i] = false;
                    continue;
                }

                while(multiply < A[j]) {
                    multiply += A[i];
                }
                if(multiply == A[j]) isP[j] = false;
            }
            if(isP[i]) numP++;
        }
        System.out.println(numP);
    }
}