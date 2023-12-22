
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (S.charAt(0) != 'A') {
            System.out.println("WA");
            return;
        }
        int ccount = 0;
        int cindx = -1;
        for (int i = 2; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'C') {
                cindx = i;
                ccount++;
            }
        }

        if (ccount != 1) {
            System.out.println("WA");
            return;
        }

        for (int i = 1; i < S.length(); i++) {
            if (i != cindx) {
                if (Character.isUpperCase(S.charAt(i))) {
                    System.out.println("WA");
                    return;
                }
            }
        }

        System.out.println("AC");
    }
}