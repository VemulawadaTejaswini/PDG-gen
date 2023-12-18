import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long[] array = new long[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) array[i] = scanner.nextLong();
        Arrays.sort(array);
        for (int i = 0; i < 3; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
}