import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();

        StringBuilder name = new StringBuilder();
        int surplus;
        for (; n > 0; n = (n - 1) / 26) {
            surplus = (int) ((n - 1) % 26);
            name.append(alphabet[surplus]);
        }

        System.out.println(name.reverse().toString());
    }
}