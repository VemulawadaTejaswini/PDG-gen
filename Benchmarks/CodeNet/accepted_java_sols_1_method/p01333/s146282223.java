import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int price, money;
            while((price = scn.nextInt()) > 0 | (money = scn.nextInt()) > 0) {
                int change  = money - price;
                int jpy1000 = change / 1000;
                int jpy500  = change % 1000 / 500;
                int jpy100  = change % 500 / 100;
                System.out.println(jpy100 + " " + jpy500 + " " + jpy1000);
            }
        }
    }
}