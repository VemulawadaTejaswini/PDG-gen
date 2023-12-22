import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();

        int price = 700;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'o') {
                price += 100;
            }
        }

        System.out.println(price);
    }
}
