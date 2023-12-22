import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char C = scanner.next().charAt(0);

        /* int m = scanner.nextInt(); */

        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }

        int j;
        for (j = 0; j < alpha.length; j++) {
            if (C == alpha[j]) {
                System.out.println(alpha[j + 1]);
                return;
            }

        }

    }
}
