import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        long money = 1000;
        long stock = 0;

        List<Integer[]> buySellAmountList = new ArrayList<>();
        int index = 0;
        while (index < a.length) {
            int buyAmount = 201;
            while (index < a.length && a[index] <= buyAmount) {
                buyAmount = a[index];
                index++;
            }
            int sellAmount = buyAmount;
            while (index < a.length && sellAmount <= a[index]) {
                sellAmount = a[index];
                index++;
            }
            if (buyAmount == sellAmount) {
                break;
            }
            buySellAmountList.add(new Integer[] { buyAmount, sellAmount });
        }

        for (Integer[] buySellAmount : buySellAmountList) {
            // 買う
            stock += money / buySellAmount[0];
            money -= stock * buySellAmount[0];
            // 売る
            money += stock * buySellAmount[1];
            stock = 0;
        }
        long result = money;

        // 出力
        System.out.println(result);
    }
}
