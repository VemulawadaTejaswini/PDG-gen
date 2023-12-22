import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] pArray = new int[n];
        for (int i = 0; i < n; i++) {
            pArray[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (pArray[i] > pArray[i - 1]) {
                if (pArray[i + 1] == pArray[i - 1]
                        || pArray[i] <= pArray[i + 1]) {
                    count++;
                }
            } else {
                if (pArray[i] > pArray[i + 1]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}