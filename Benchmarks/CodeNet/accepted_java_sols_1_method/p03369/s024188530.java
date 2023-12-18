import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = 700;
        char[] S = sc.next().toCharArray();

        if (S[0] == 'o') {
            price += 100;
        }
        if (S[1] == 'o') {
            price += 100;
        }
        if (S[2] == 'o') {
            price += 100;
        }
        System.out.println(price);
    }
}