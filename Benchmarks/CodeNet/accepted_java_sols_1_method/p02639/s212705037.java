import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] X = new int[5];
        int result = 0;

        for (int i = 0; i < 5; i++) {
            X[i] = scanner.nextInt();
            if (X[i] == 0) {
                result = i+1;
            }
        }

        System.out.println(result);
    }
}
