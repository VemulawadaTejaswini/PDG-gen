import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum ^= a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print((sum ^ a[i])+" ");
        }
	// write your code here
    }
}
