import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 入力受付
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                result += array[i] * array[j];
            }
        }

        System.out.println(result);

    }

}