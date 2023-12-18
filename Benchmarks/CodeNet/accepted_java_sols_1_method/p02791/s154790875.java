import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArray = new int[n];
        int count = 1;

        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }

        int min = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
                count++;
            }
        }
        System.out.println(count);
    }

}