import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        System.out.print(input[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            System.out.print(" " + input[i]);
        }
        System.out.println();
    }
}

