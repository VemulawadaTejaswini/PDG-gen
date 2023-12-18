import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        long num = 26;
        int temp = 1;

        for (int i = 0; i < 100000; i++) {
            if (a > num) {
                temp++;
                num *= 26;
            }
        }

        num /= 26;

        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < temp; i++) {
            char chr = 'a';
            for (int j = 0; j < 27; j++) {
                if (a > num) {
                    if (temp != i + 1 && j == 0) {
                    } else {
                        chr++;
                    }
                    a -= num;
                } else {
                    break;
                }

            }

            sb1.append(chr);
            num /= 26;
        }

        System.out.println(sb1.toString());

    }

}