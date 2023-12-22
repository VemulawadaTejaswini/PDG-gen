import java.util.Scanner;

/**
 * Created by zzt on 17-1-29.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int start = s.indexOf('A');
        int end = s.lastIndexOf('Z');
        System.out.println(end - start + 1);
    }
}