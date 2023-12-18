public class Main {

    public static void main(String[] args) {

        int money = 1000;
        int kabuValue = 0;

        // 準備
        int day = new java.util.Scanner(System.in).nextInt();
        int[] kabuPrice = new int[day];

        for (int i = 0; i < kabuPrice.length; i++) {
            kabuPrice[i] = new java.util.Scanner(System.in).nextInt();
        }

        for (int i = 0; i < kabuPrice.length - 1; i++) {

            // 購入チャンス
            if (kabuPrice[i] < kabuPrice[i + 1] && kabuPrice[i] < money) {
                kabuValue = money / kabuPrice[i];
                money = money - kabuValue * kabuPrice[i];
            }

            // 売却チャンス
            if (kabuPrice[i] > kabuPrice[i + 1] && kabuValue > 0) {
                money = money + kabuValue * kabuPrice[i];
                kabuValue = 0;
            }

            // 最終日の売り払い
            if (i == kabuPrice.length - 2 && kabuValue > 0) {
                money = money + kabuValue * kabuPrice[i + 1];
                kabuValue = 0;
            }
        }

        System.out.println(money);


    }

}
