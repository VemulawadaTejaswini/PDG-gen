import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char last = N.charAt(N.length() - 1);
        switch (last) {
            case '3':
                System.out.println("bon");
                break;
            case '0':
            case '1':
            case '6':
            case '8':
                System.out.println("pon");
                break;
            default:
                System.out.println("hon");
        }
    }
}