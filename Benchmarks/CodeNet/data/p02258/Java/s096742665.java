import java.util.Scanner;

public class Main {
    public static int compute_maxprofit1(int[] R) {
        int max_profit = Integer.MIN_VALUE;
        for (int i = 1; i < R.length; i++)
            for (int j = 1; j < R.length; j++)
                if (R[j] - R[i] > max_profit)
                    max_profit = R[j] - R[i];
        return max_profit;
    }

    public static int compute_maxprofit2(int[] R) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < R.length; i++) {
            if (max < R[i] - min)
                max = R[i] - min;
            if (min > R[i])
                min = R[i]; 
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] R = new int[n];
        for (int i = 0; i < n; i++)
            R[i] = in.nextInt();
        in.close();
        System.out.println(compute_maxprofit2(R));
    }
}

