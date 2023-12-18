import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();

        System.out.println(s.substring(0, 1) + s.substring(1, s.length() - 1).length() + s.substring(s.length() - 1,
                s.length()));

    }
}