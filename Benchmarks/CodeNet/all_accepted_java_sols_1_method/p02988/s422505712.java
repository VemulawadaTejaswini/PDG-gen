import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] A = new int [N+1];
        for(int i = 1; i<N+1; i++){
            A[i] = scanner.nextInt();
        }
        scanner.close();
        
        int count = 0;
        for(int j = 2; j<N; j++){
            if((A[j-1]<A[j] && A[j]<A[j+1]) || (A[j-1]>A[j] && A[j]>A[j+1])){
            count++;
            }
        }
        
        System.out.println(count);
        
    }
}
