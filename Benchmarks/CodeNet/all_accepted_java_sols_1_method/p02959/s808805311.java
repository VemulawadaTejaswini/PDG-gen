import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n + 1];
        long x = 0;
        for (int i = 0; i < n + 1; i++) arr[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int mo = Math.min(arr[i], num);
            arr[i] -= mo;
            num -= mo;
            x += mo;

            if (num != 0) {
                mo = Math.min(arr[i + 1], num);
                arr[i + 1] -= mo;
                num -= mo;
                x += mo;
            }
        }

        System.out.println(x);

    }
}
