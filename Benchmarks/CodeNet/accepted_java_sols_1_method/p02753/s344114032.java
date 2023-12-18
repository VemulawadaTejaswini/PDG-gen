import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.next().toCharArray();
        if (s[0] == s[1] && s[0] == s[2]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}