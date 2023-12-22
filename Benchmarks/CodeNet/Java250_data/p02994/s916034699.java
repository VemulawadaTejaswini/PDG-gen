import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int l = stdIn.nextInt();
        int[] t = new int[n]; // 味
        for (int i = 0; i < n; i++) {
            t[i] = l + i;
        }
        int min = Math.abs(t[0]);
        for (int i = 1; i < n; i++) {
            if (min > Math.abs(t[i]))
                min = Math.abs(t[i]);
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += t[i];
        }
        if (t[n - 1] < 0)
            System.out.println(total + min);
        else
            System.out.println(total - min);
    }
}