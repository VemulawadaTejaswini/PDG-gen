import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] intArray = new int[a];
        int[] intArray2 = new int[a];
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            intArray[i] = b;
        }
            for (int i = 0; i < a; i++) {
                intArray2[a - i - 1] = intArray[i];
            }
            for (int k = 0; k < a - 1; k++) {
                System.out.print(intArray2[k] + " ");
            }
            System.out.println(intArray2[a - 1]);
        }
}