import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        switch (N % 10) {
            case 3:
                System.out.println("bon");
                return;
            case 0:
            case 1:
            case 6:
            case 8:
                System.out.println("pon");
                return;
            default:
                System.out.println("hon");
                return;
        }
    }
}