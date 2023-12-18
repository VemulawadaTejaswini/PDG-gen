import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money % 1000 == 0) {
            System.out.println(0);
        } else {
        int a = money / 1000;
        a = a + 1;
        System.out.println(a * 1000 - money);
        }
    }
}