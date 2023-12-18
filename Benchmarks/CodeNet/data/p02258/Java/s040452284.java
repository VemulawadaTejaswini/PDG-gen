import java.util.*;
public class test {

   public static void main(String[] args)
    {
        Scanner sc = new Scanner();
        int n = sc.nextInt();
        int max_profit = 0;
        int min = 1000000000;
        for (int i = 0; i < n; ++i)
        {
            int data = sc.nextInt();
            int profit = data - min;
            if (profit > max_profit)
            {
                max_profit = profit;
            }
            if (data < min)
            {
                min = data;
            }
        }
        System.out.println(max_profit);
    }
}