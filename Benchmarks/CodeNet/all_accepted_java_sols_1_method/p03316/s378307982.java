import java.util.Scanner;

public class Main {
    static int N;
    static int[] a;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        scanner.close();

        int ntmp = N;
        int digitSum = 0;
        while (0 < ntmp) {
            digitSum += ntmp % 10;
            ntmp /= 10;
        }

        if(N % digitSum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}