import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int C = scanner.nextInt();

        int[] B = new int[M];
        for(int i=0; i<M; i++){
            B[i] = scanner.nextInt();
        }

        int cnt = 0;
        for(int i=0; i<N; i++){
            int sum = C;
            for(int j=0; j<M; j++){
                sum += B[j] * scanner.nextInt();
            }

            if(sum > 0){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
