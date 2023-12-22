import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println((double) w * h / 2);
        if((x ==  (double) w / 2) && (y == (double) h / 2)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
