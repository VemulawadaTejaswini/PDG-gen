import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int h, w;
            h = sc.nextInt();
            w = sc.nextInt();
            if (h == 0 && w == 0)
                break;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
  
}
