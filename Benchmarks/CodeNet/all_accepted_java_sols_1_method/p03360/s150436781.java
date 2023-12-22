import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = {a, b, c};
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) arr[2] *= 2;
        System.out.println(Arrays.stream(arr).sum());
    }
}