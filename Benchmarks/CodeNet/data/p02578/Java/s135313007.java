import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i = 0;i < N; i ++) {
            A[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i = 1;i < N; i ++) {
            if(A[i - 1] > A[i]) {
                int val = Math.abs(A[i] - A[i - 1]);
                sum += val;
                A[i] += val;
            }
        }
        System.out.println(sum);
    }
}
