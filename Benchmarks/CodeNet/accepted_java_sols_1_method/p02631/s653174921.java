import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int xor = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            xor ^= array[i];
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(xor ^ array[i]).append(" ");
        }
        System.out.print(builder);
    }
}