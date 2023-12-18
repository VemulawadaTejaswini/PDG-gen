import java.util.Scanner;

public class MaximumProfit {

    public static void main(String[] args) {

        // ?????\??°???
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            throw new IllegalArgumentException("prices?????????null ??? ??????????????§???1");
        }

        int maxValIndex = 0;
        int maxVal = prices[maxValIndex];
        int minVal = Integer.MAX_VALUE;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > maxVal) {
                maxVal = prices[i];
                maxValIndex = i;
            }
            if (i <= maxValIndex) {
                minVal = Math.min(minVal, prices[i - 1]);
            }
        }
        return maxVal - minVal;
    }

}