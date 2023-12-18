import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            sum += x[i];
        }
        int pos1 = sum / n;
        int pos2 = sum / n + 1;
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < n; i++) {
            result1 += Math.pow((x[i] - pos1), 2);
            result2 += Math.pow((x[i] - pos2), 2);
        }
        System.out.println(Math.min(result1, result2));
    }

}
