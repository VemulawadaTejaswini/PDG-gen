import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        
        while (true) {
            int x = num.nextInt();
            int y = num.nextInt();
            if (x != 0 || y != 0) {
                if (x < y) {
                    System.out.println(x + " " + y);
                } else {
                    System.out.println(y + " " + x);
                }

            } else {
                break;
            }
        }
    }
}