import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N;
        int[] V;
        int[] C;
        N = sc.nextInt();
        V = new int[N];
        C = new int[N];
        for(int i = 0; i < N; i++){
            V[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            C[i] = sc.nextInt();
        }
        int result = 0;
        for(int i = 0; i < N; i++){
            if(V[i] > C[i]){
                result += V[i] - C[i];
            }
        }
        System.out.println(result);
    }
}
