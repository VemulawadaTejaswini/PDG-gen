import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();
        int len = sc.nextInt();
        boolean[] disable = new boolean[10];
        for (int i = 0; i < len; i++) {
            disable[sc.nextInt()] = true;
        }
        sc.nextLine();

        int base = 1;
        while (base < 100000) {
            if (base <= pay && disable[(pay % (base * 10)) / base]) {
                pay += base - (pay % base);
                base = 1;
            } else {
                base *= 10;
            }
        }
        System.out.println(pay);
    }
}