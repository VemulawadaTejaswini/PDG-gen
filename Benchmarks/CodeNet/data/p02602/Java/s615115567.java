import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        Arrays.setAll(array, i -> sc.nextInt());

        for (int i = 0; i < n - k; i++) {
            System.out.println(array[i] >= array[i + k] ? "No" : "Yes");
        }
    }
}