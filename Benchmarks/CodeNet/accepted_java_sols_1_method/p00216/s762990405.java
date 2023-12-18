
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = scan.nextInt();

        while (w > -1) {
            int a = 1150;
            int b = 4280;
            
            if (w > 30) {
                a += 160 * (w - 30);
                w = 30;
            }
            
            if (w > 20) {
                a += 140 * (w - 20);
                w = 20;
            }
            
            if (w > 10) {
                a += 125 * (w - 10);
                w = 10;
            }
            
            System.out.println(b - a);
             w = scan.nextInt();
        }
    }
}

