import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC154B - I miss you...

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String x = s.replaceAll(".", "x");

        System.out.println(x);
    }
}