import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String a = sc.next();

        System.out.println(a.equals(a.toUpperCase()) ? "A" : "a");
    }
}
