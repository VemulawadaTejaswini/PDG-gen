import java.util.Scanner;

public class Main {

    static void printBWD(String str, int n) {
        if (n < str.length()) {
            printBWD(str, n + 1);
            System.out.print(str.charAt(n));
        }
        return;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        printBWD(line, 0);
        System.out.println();
    }
}