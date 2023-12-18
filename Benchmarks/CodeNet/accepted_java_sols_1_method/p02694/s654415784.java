import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long year = 0;
        long money = 100;
        while (money < X ) {
            money += money / 100;
            year++;
        }
        System.out.println(year);
        sc.close();
    }
}