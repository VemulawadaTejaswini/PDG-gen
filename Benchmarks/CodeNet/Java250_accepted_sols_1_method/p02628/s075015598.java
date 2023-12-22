import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] fluitArray = new int[n];
        for (int i = 0; i < n; i++) {
            fluitArray[i] = sc.nextInt();
        }
        Arrays.sort(fluitArray);
        int result = 0;
        for(int i = 0; i<k; i++) {
            result += fluitArray[i];
        }
        System.out.println(result);
    }
}