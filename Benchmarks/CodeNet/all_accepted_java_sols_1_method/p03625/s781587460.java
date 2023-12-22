import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] list = new long[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }

        Arrays.sort(list);

        long last = 0;
        long max = 0;
        long nextMax = 0;
        boolean hasMax = false;
        for (int i = n - 1; i >= 0 ; i--) {
            if (last == list[i]) {
                if (hasMax) {
                    nextMax = last;
                    break;
                } else {
                    max = last;
                    last = 0;
                    hasMax = true;
                }
            } else {
                last = list[i];
            }
        }

        System.out.println(max * nextMax);
    }
}