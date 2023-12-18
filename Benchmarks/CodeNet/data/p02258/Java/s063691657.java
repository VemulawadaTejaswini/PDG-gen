import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int minRate = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0 ; i < n; i++) {
            int r = in.nextInt();
            if(r < minRate) minRate = r;
            maxProfit = (maxProfit > r - minRate)? maxProfit : r - minRate;
        }
        System.out.print(maxProfit);
    }
}