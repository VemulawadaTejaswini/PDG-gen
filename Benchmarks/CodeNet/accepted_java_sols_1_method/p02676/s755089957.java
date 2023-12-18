import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String target = sc.next();

        if (len >= target.length()) {
            System.out.println(target);
        } else {
            System.out.println(target.substring(0, len) + "...");
        }

    }
}
