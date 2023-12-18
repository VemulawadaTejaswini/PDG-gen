import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {

        Scanner in = new Scanner(System.in);

        boolean result = true;
        int n = in.nextInt();

        int tPrev = 0;
        int xPrev = 0;
        int yPrev = 0;

        for (int i = 0; i<n; i++) {
            int t = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            result = ((t-tPrev)%2 == Math.abs(x+y-xPrev-yPrev)%2) && result;
            result = (Math.abs(x+y-xPrev-yPrev) <= (t-tPrev)) && result;

            tPrev = t;
            xPrev = x;
            yPrev = y;
        }

        if (result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}