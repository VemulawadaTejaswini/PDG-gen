import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] B = new int[M];

        for (int i = 0; i < M; i++) {
            B[i]= sc.nextInt();
        }

        int count =0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                int a= sc.nextInt();
                sum += a * B[j];

            }
            if(sum+C > 0){
                count++;
            }

        }

        System.out.println(count);

    }

}
