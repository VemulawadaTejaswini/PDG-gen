import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) array[i] = scanner.nextInt();
        for (int i = 0; i < 3; i++) System.out.print(array[i] + " ");
    }
}