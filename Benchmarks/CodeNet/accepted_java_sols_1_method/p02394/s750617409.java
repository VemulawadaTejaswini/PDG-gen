import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int w = inp.nextInt();
        int h = inp.nextInt();
        int x = inp.nextInt();
        int y = inp.nextInt();
        int r = inp.nextInt();

        if (x+r <= w && x-r >= 0) {
            if (y+r <= h && y-r >= 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}

