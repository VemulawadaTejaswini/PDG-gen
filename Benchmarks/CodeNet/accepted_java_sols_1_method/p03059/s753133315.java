import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A, B, T;
        int sum = 0;
        int i = 1;
        A = sc.nextInt();
        B = sc.nextInt();
        T = sc.nextInt();
        while (A * i <= T + 0.5) {
            sum = sum + B;
            i++;
        }
        System.out.println(sum);
    }
}