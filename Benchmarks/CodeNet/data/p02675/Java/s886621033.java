import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = n % 10;

        if (mod == 2 || mod == 4 || mod == 5 || mod == 7 || mod == 9) {
            System.out.println("hon");
        } else if (mod == 0 || mod == 1 || mod == 6 || mod == 8) {
            System.out.println("pon");
        } else if (mod == 3) {
            System.out.println("bon");
        }

    }
}