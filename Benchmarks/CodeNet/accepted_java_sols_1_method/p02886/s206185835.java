import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int value = list[i];
            for (int index = i + 1; index < n; index++) {
                sum += value * list[index];
            }
        }

        // 出力
        System.out.println(sum);
    }
}