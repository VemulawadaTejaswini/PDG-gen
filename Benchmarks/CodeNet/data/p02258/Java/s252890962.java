

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        int res = maximumProfit(arr);
        System.out.println(res);
    }
    public static int maximumProfit(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++)
        {
            min = Math.min(min, arr[i-1]);
            max = Math.max(max, arr[i]-min);
        }
        return max;
    }
}

