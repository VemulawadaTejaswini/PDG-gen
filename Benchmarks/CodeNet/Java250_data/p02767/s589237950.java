import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        double sum = 0;
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            sum += X[i];
        }
        int P = (int)Math.round(sum/N);
        
        int dis=0;

        for (int i = 0; i < N; i++) {
            dis+=Math.pow((X[i]-P), 2);
        }
        System.out.println(dis);
    }
}