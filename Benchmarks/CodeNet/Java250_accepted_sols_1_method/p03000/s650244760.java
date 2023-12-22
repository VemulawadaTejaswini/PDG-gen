import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int X = input.nextInt();

        int[] L = new int[n];

        for (int i = 0; i < L.length; i++) {
            L[i] = input.nextInt();
        }
        int count = 0;
        for (int j = 0; j < L.length; j++) {
            X -= L[j];
            if (X >= 0) {
                count += 1;
            }
        }

        System.out.println(count+1);
    }
}