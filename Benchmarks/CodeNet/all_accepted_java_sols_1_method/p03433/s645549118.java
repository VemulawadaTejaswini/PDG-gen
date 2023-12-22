import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// n円(支払う額)
        int a = sc.nextInt();// 1円の枚数a枚

        int leftCoin = n % 500;
        if (leftCoin <= a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
