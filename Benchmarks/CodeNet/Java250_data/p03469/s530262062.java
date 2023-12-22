import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        byte[] b = s.getBytes();
        b[3] = '8';
        s = new String(b);
        System.out.println(s);
    }
}