import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        long price  = sc.nextLong();

        long happypoint = 0;

        // 500円玉のhappypoint
        happypoint = happypoint + (price/500) * 1000;

        price = price % 500;

        // 5円玉のhappypoint
        happypoint = happypoint + (price/5) * 5;

        // 出力
        System.out.println(happypoint);

        sc.close();
    }

}