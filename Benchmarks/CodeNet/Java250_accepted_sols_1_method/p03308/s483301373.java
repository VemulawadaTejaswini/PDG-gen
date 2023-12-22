import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE, minIndex = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > max && i != minIndex) {
                max = arr[i];
            }
        }
        System.out.println(max - min);
    }
}
