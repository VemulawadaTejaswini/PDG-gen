import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            sum += value;
            list[i] = sum;
        }
        int min = Integer.MAX_VALUE;
        for (int value: list
             ) {
            int target = Math.abs(value - (sum - value));
            if (target < min) {
                min = target;
            }
        }
        System.out.println(min);
    }
}