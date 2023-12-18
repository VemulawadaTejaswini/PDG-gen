import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        int price = 700;
        char[] data = text.toCharArray();
        for(char c : data) {
            if (c == 'o') {
                price += 100;
            }
        }
        System.out.println(price);
    }
}