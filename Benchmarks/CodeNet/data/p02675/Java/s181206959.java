import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int place1 = (sc.nextInt() % 100) % 10;
        switch (place1) {
            case 2:
                System.out.println("hon");
                break;
            case 4:
                System.out.println("hon");
                break;
            case 5:
                System.out.println("hon");
                break;
            case 7:
                System.out.println("hon");
                break;
            case 9:
                System.out.println("hon");
                break;
            case 0:
                System.out.println("pon");
                break;
            case 1:
                System.out.println("pon");
                break;
            case 6:
                System.out.println("pon");
                break;
            case 8:
                System.out.println("pon");
                break;
            case 3:
                System.out.println("bon");
                break;
        }
    }
}
