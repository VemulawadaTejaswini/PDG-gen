import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] dArr = new int[N];

        for (int i=0; i< N; i++) {
            dArr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i=0; i< N; i++) {
            for (int k=i+1; k< N; k++) {
                sum += dArr[i] * dArr[k];
            }
        }
        System.out.println(sum);
    }
}