import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int X = input.nextInt();

        int[] L = new int[n];

        for (int i = 0; i < L.length; i++) {
            L[i] = input.nextInt();;
        }
        int[] D = new int[n + 1];
        D[0] = 0;
        for (int j = 1; j < D.length; j++) {
            D[j] = D[j - 1] + L[j - 1];
        }
        int count = 0;
        for (int k = 0; k < D.length; k++) {
            if (D[k] <= X) {
                count += 1;
            }

        }
        System.out.println(count);
    }
}