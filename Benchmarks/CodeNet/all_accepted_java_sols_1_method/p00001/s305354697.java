import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int input[] = new int[10];

        for (int i = 0; i < 10; i++) {
            input[i] = sc.nextInt();
        }

        Arrays.sort(input);

        for (int i = 9; i > 6; i--) {
            System.out.println(input[i]);
        }
    }
}