import java.util.*;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n + 2];
        int[] gaps = new int[n + 2];

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            list[i] = sc.nextInt();
        }
        for (int i = 0; i < n + 1; i++) {
            gaps[i] = Math.abs(list[i] - list[i + 1]);
            sum += gaps[i];
        }


        for (int i = 1; i <= n; i++) {
            System.out.println(sum - gaps[i] - gaps[i - 1] + Math.abs(list[i - 1] - list[i + 1]));
        }
    }
}