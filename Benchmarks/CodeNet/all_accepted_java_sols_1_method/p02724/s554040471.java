
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        long money = scanner.nextLong();
        long ans = 0;
        ans += money / 500 * 1000;
        ans += (money % 500) / 5 * 5;
        System.out.println(ans);
    }
}
