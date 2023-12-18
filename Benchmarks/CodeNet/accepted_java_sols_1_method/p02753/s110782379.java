import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC158A - Station and Bus

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println((s.equals("AAA") || s.equals("BBB")) ? "No" : "Yes");
    }
}