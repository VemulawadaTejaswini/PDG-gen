import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(s.substring(0, 1) + String.valueOf(s.length() - 2) + s.substring(s.length() - 1, s.length()));
    }
}