import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();
        var A = new int[N];
        var isP = new boolean[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
            isP[i] = true;
        }

        Arrays.sort(A);
        for(int i=0; i<N && isP[i]; i++) {
            for(int j=0; i != j && isP[j]; j++) {
                if(A[i] == A[j]) isP[i] = false;
                if(A[j] % A[i] == 0) isP[j] = false;
            }
        }
        
        int numP = 0;
        for(int i=0; i<N; i++) {
            if(isP[i]) numP++;
        }
        System.out.println(numP);
    }
}