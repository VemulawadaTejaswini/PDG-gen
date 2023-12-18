import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String string = scanner.next();
        char[] chars = string.toCharArray();
        chars[k-1] = Character.toLowerCase(chars[k-1]);

        System.out.println(String.valueOf(chars));
    }
}