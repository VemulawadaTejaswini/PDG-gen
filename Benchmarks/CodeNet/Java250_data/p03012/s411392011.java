import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] w = new int[N];
        w[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            w[i] = w[i-1]+sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int front = w[i];
            int back = w[N-1]-w[i];
            min = Math.min(min, Math.abs(back-front));
        }
        System.out.println(min);
    }
}