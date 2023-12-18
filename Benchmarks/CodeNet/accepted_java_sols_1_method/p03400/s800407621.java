import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int X = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        scanner.close();

        int count = 0;
        for (int a : A) {
            for (int i = 0; i < D; i++) {
                if ((a * i + 1) > D) {
                    break;
                }
                count++;
            }
        }

        System.out.println(count + X);
    }
}