import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char[] string = scanner.nextLine().toCharArray();

        final StringBuilder stringA = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < string.length; i++) {
            if (flag) {
                stringA.append("0");
            } else {
                stringA.append("1");
            }
            flag = !flag;
        }
        final char[] a = stringA.toString().toCharArray();

        final StringBuilder stringB = new StringBuilder();
        flag = false;
        for (int i = 0; i < string.length; i++) {
            if (flag) {
                stringB.append("0");
            } else {
                stringB.append("1");
            }
            flag = !flag;
        }
        final char[] b = stringB.toString().toCharArray();

        int resultA = 0;
        int resultB = 0;

        for (int i = 0; i < string.length; i++) {
            if (string[i] != a[i]) {
                resultA++;
            }

            if (string[i] != b[i]) {
                resultB++;
            }
        }

        System.out.println(Math.min(resultA, resultB));
    }
}
