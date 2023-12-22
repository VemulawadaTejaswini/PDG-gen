import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rate = new int[9];
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp < 400) {
                rate[0]++;
            } else if (tmp < 800) {
                rate[1]++;
            } else if (tmp < 1200) {
                rate[2]++;
            } else if (tmp < 1600) {
                rate[3]++;
            } else if (tmp < 2000) {
                rate[4]++;
            } else if (tmp < 2400) {
                rate[5]++;
            } else if (tmp < 2800) {
                rate[6]++;
            } else if (tmp < 3200) {
                rate[7]++;
            } else {
                rate[8]++;
            }
        }
        int count = 0;
        for (int i = 0; i <= 7; i++) {
            if (rate[i] > 0) {
                count++;
            }
        }
        System.out.println(Math.max(count, 1) + " " + (count + rate[8]));
    }
}