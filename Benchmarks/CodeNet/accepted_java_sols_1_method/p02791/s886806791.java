import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArray = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }

        double curMin = 1e9;

        for (int value : intArray) {
            curMin = Math.min(curMin, value);
            if (curMin == value) {
                count++;
            }
        }
        System.out.println(count);
    }

}