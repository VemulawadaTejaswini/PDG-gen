import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();

        int P[] = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        Arrays.sort(P);

        int sum = 0;
        for(int i = 0; i < K; i++){
            sum+=P[i];
        }
        System.out.println(sum);
    }
}