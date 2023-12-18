import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] A = new int[M][2];
        for(int i = 0; i < M; i++){
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }
        
        Arrays.sort(A, (a, b) -> Integer.compare(a[1], b[1]) );
        
        int ans = 0;
        for(int i = 0; i < M;){
            
            int right = A[i][1];
            ans++;

            i++;
            while( i < M && A[i][0] < right ){
                i++;
            }
        }
        
        System.out.println(ans);
        
    }
}
