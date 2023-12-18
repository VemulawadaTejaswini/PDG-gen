import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long money = 100;
        long ans = 0;
        while (money < x) {
            ans++;
            money += money * 0.01;
        }
        System.out.println(ans);
    }
}