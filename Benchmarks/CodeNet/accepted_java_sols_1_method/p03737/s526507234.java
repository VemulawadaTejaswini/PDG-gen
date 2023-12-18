import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();

        scanner.close();
        System.out.println(String.format("%s%s%s", String.valueOf(s1.charAt(0)).toUpperCase(), String.valueOf(s2.charAt(0)).toUpperCase(), String.valueOf(s3.charAt(0)).toUpperCase()));
    }
}
