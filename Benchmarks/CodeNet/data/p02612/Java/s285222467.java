import java.util.Scanner;

public class Practice0708 {
    public static void main(String[] args) {
        //N円の商品を1000円札のみで買い、お釣りを表示
        Scanner sc = new Scanner(System.in);
        System.out.print("入力:");
        int N = sc.nextInt();
        int money = 1000;

 

        if (N % money == 0) {//お釣りなし
            System.out.println(0);
        }else {//お釣りあり
            money = (N/money +1)*1000;
            System.out.println(money-N);
        }
    }

 

}